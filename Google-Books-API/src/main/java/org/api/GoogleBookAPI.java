package org.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.net.URIBuilder;
import org.pojos.performingSearch.Volumes;
import org.pojos.retrievingBookshelf.Bookshelf;
import org.pojos.retrievingBookshelfVolume.BookshelfVolumes;
import org.pojos.retrievingBookshelves.Bookshelves;
import org.pojos.retrievingVolume.Volume;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

public class GoogleBookAPI {

    public static Volumes performingSearch(String query,
                                           ArrayList<String> intitle,
                                           List<String> subject,
                                           List<String> inauthor,
                                           List<String> isbn,
                                           String download,
                                           String filtering,
                                           String langRestrict,
                                           Integer startIndex,
                                           Integer maxResults,
                                           String printType,
                                           String projection,
                                           String orderBy,
                                           String key) throws URISyntaxException, IOException {

        // Modify query parameter if terms exist ('intitle', 'subject', 'inauthor', 'isbn')
        if (!intitle.isEmpty()) {
            String joinedIntitle = intitle.toString().replace(", ", "+");
            query = query+"+intitle:"+joinedIntitle.substring(1, joinedIntitle.length() - 1);
        }
        if (!subject.isEmpty()) {
            String joinedSubject = subject.toString().replace(", ", "+");
            query = query+"+subject:"+joinedSubject.substring(1, joinedSubject.length() - 1);
        }
        if (!inauthor.isEmpty()) {
            String joinedInauthor = inauthor.toString().replace(", ", "+");
            query = query+"+inauthor:"+joinedInauthor.substring(1, joinedInauthor.length() - 1);
        }
        if (!isbn.isEmpty()) {
            String joinedIsbn = isbn.toString().replace(", ", "+");
            query = query+"+isbn:"+joinedIsbn.substring(1, joinedIsbn.length() - 1);
        }

        // Initialize http client with required parameters (query & API key)
        CloseableHttpClient httpClient = HttpClients.createDefault();
        URIBuilder builder = new URIBuilder("https://www.googleapis.com/books/v1/volumes");
        builder.setParameter("q", query).setParameter("key", key);

        /*
            Optional Parameters: (download, filtering, langRestrict, startIndex, maxResults, printType, projection, orderBy)
        */

        // List of values: ("epub")
        if (download.equals("epub")){
            builder.setParameter("download", download);
        }

        // List of values: ("partial", "full", "free-ebooks", "paid-ebooks", "ebooks")
        Set<String> filterSet = new HashSet<String>(Arrays.asList("partial", "full", "free-ebooks", "paid-ebooks", "ebooks"));
        filtering = filtering.trim();
        if (filterSet.contains(filtering)){
            builder.setParameter("filter", filtering);
        }

        // Trimmer to remove leading & trailing spaces
        langRestrict = langRestrict.trim();
        if (langRestrict!=""){
            builder.setParameter("langRestrict", langRestrict);
        }

        // Validation on startIndex - Default: 0
        if (startIndex<0 || startIndex!=null) {
            builder.setParameter("startIndex", "0");
        } else {
            builder.setParameter("startIndex", String.valueOf(startIndex));
        }

        // Validation on maxResults - min: 1 & max: 10
        if (maxResults <= 10 && maxResults>=1) {
            builder.setParameter("maxResults", String.valueOf(maxResults));
        }

        // List of values: ("all", "books", "magazines")
        Set<String> printTypeSet = new HashSet<String>(Arrays.asList("all", "books", "magazines"));
        printType = printType.trim();
        if (printTypeSet.contains(printType)){
            builder.setParameter("printType", printType);
        }

        // List of values: ("full", "lite")
        Set<String> projectionSet = new HashSet<String>(Arrays.asList("full", "lite"));
        projection = projection.trim();
        if (projectionSet.contains(projection)){
            builder.setParameter("projection", projection);
        }

        // List of values: ("relevance", "newest")
        Set<String> orderBySet = new HashSet<String>(Arrays.asList("relevance", "newest"));
        orderBy = orderBy.trim();
        if (orderBySet.contains(orderBy)){
            builder.setParameter("orderBy", orderBy);
        }

        // Get request: Volumes
        HttpGet request = new HttpGet(builder.build());
        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = ((CloseableHttpResponse) response).getEntity();
        if (entity != null) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Volumes volumes = mapper.readValue(((CloseableHttpResponse) response).getEntity().getContent(), Volumes.class);
            return volumes;
        } else {
            return null;
        }
    }

    public static Volume retrievingVolume(String volumeId, String key) throws URISyntaxException, IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String uriString = "https://www.googleapis.com/books/v1/volumes/"+volumeId;
        URIBuilder builder = new URIBuilder(uriString);
        builder.setParameter("key", key);
        HttpGet request = new HttpGet(builder.build());
        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = ((CloseableHttpResponse) response).getEntity();
        if (entity != null) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Volume volume = mapper.readValue(((CloseableHttpResponse) response).getEntity().getContent(), Volume.class);
            return volume;
        } else {
            return null;
        }
    }

    public static Bookshelves retrievingBookshelves(String userId, String key) throws URISyntaxException, IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String uriString = "https://www.googleapis.com/books/v1/users/"+userId+"/bookshelves";
        URIBuilder builder = new URIBuilder(uriString);
        builder.setParameter("key", key);
        HttpGet request = new HttpGet(builder.build());
        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = ((CloseableHttpResponse) response).getEntity();
        if (entity != null) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Bookshelves bookshelves = mapper.readValue(((CloseableHttpResponse) response).getEntity().getContent(), Bookshelves.class);
            return bookshelves;
        } else {
            return null;
        }
    }

    public static Bookshelf retrievingBookshelf(String userId, int bookshelfId, String key) throws URISyntaxException, IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String uriString = "https://www.googleapis.com/books/v1/users/"+userId+"/bookshelves/"+String.valueOf(bookshelfId);
        URIBuilder builder = new URIBuilder(uriString);
        builder.setParameter("key", key);
        HttpGet request = new HttpGet(builder.build());
        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = ((CloseableHttpResponse) response).getEntity();
        if (entity != null) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Bookshelf bookshelf = mapper.readValue(((CloseableHttpResponse) response).getEntity().getContent(), Bookshelf.class);
            return bookshelf;
        } else {
            return null;
        }
    }

    public static BookshelfVolumes retrievingBookshelfVolumes(String userId, int bookshelfId, String key) throws URISyntaxException, IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String uriString = "https://www.googleapis.com/books/v1/users/"+userId+"/bookshelves/"+String.valueOf(bookshelfId)+"/volumes";
        URIBuilder builder = new URIBuilder(uriString);
        builder.setParameter("key", key);
        HttpGet request = new HttpGet(builder.build());
        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = ((CloseableHttpResponse) response).getEntity();
        if (entity != null) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            BookshelfVolumes bookshelfVolumes = mapper.readValue(((CloseableHttpResponse) response).getEntity().getContent(), BookshelfVolumes.class);
            return bookshelfVolumes;
        } else {
            return null;
        }
    }
}


