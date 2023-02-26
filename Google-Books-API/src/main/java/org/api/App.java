package org.api;

import org.pojos.performingSearch.Volumes;
import org.pojos.retrievingBookshelf.Bookshelf;
import org.pojos.retrievingBookshelfVolume.BookshelfVolumes;
import org.pojos.retrievingBookshelves.Bookshelves;
import org.pojos.retrievingVolume.Volume;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.api.GoogleBookAPI.*;
import static org.utils.Utils.API_KEY;


public class App
{
    public static void main( String[] args ) throws IOException, URISyntaxException {

        String query = "Harry Potter";
        ArrayList<String> intitles = new ArrayList<String>(Arrays.asList("Harry", "Potter"));
        ArrayList<String> subject = new ArrayList();
        ArrayList<String> inauthors = new ArrayList();
        ArrayList<String> isbn = new ArrayList();
        String download = "";
        String filtering = "ebook";
        String langRestrict = "en";
        Integer startIndex = 0;
        Integer maxResults = 0;
        String printType = "";
        String projection = "";
        String orderBy = "";
        String userId = "102701940585560677579";

        // REST API Calls
        Volumes volumes = performingSearch(query, intitles, subject, inauthors, isbn, download, filtering, langRestrict, startIndex, maxResults, printType, projection, orderBy, API_KEY);;
        Volume volume = retrievingVolume(volumes.getItems().get(2).getId(), API_KEY);
        Bookshelves bookshelves = retrievingBookshelves(userId, API_KEY);
        Bookshelf bookshelf = retrievingBookshelf(userId, bookshelves.getItems().get(1).getId(), API_KEY);
        BookshelfVolumes bookshelfVolumes = retrievingBookshelfVolumes(userId, bookshelves.getItems().get(1).getId(), API_KEY);

//        System.out.println(volume.getVolumeInfo().getImageLinks().getThumbnail());
//        System.out.println(volume.getVolumeInfo().getImageLinks().getSmallThumbnail());
        // Print responses
//        System.out.println(volumes.toString());
//        System.out.println(volume.toString());
//        System.out.println(bookshelves.toString());
//        System.out.println(bookshelf.toString());
//        System.out.println(bookshelfVolumes.toString());
    }
}
