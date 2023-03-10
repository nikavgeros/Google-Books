package menu.searchVolumeMenu.options;

import org.pojos.performingSearch.Volumes;
import org.pojos.retrievingVolume.Volume;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.api.GoogleBookAPI.performingSearch;
import static org.api.GoogleBookAPI.retrievingVolume;
import static org.utils.Utils.API_KEY;
import static utils.Utils.readFile;
import static utils.Utils.writeToFile;

public class SearchVolumeOptions {


    public static Volumes searchVolumesBasedOnCriteria() throws URISyntaxException, IOException {
        Scanner in = new Scanner(System.in);
        String query;

        while (true) {
            System.out.println("Type query: ");
            query = in.nextLine().trim();
            if (query.equals("")) {
                System.out.println("Query is required!");
            } else {
                writeToFile(query);
                break;
            }
        }

        System.out.println("Type title or press enter to continue: ");
        ArrayList<String> intitles = new ArrayList();
        String userTitle = in.nextLine().trim();
        if (!userTitle.equals("")) {
            intitles.add(userTitle);
        }

        System.out.println("Type subject or press enter to continue: ");
        ArrayList<String> subject = new ArrayList();
        String userSubject = in.nextLine().trim();
        if (!userSubject.equals("")) {
            subject.add(userSubject);
        }

        System.out.println("Type author or press enter to continue: ");
        ArrayList<String> inauthors = new ArrayList();
        String userAuthor = in.nextLine().trim();
        if (!userAuthor.equals("")) {
            inauthors.add(userAuthor);
        }

        System.out.println("Type isbn or press enter to continue: ");
        ArrayList<String> isbn = new ArrayList();
        String userIsbn = in.nextLine().trim();
        if (!userIsbn.equals("")) {
            isbn.add(userIsbn);
        }

        System.out.println("Type download or press enter to continue: ");
        String download = in.nextLine().trim();
        if (download.equals("")) {
            download = "";
        }

        System.out.println("Type filtering or press enter to continue: ");
        String filtering = in.nextLine().trim();
        if (filtering.equals("")) {
            filtering = "";
        }

        System.out.println("Type language or press enter to continue: ");
        String langRestrict = in.nextLine().trim();
        if (langRestrict.equals("")) {
            langRestrict = "en";
        }

        System.out.println("Type start index or press enter to continue: ");
        Integer startIndex;
        try {
            startIndex = Integer.parseInt(in.nextLine().trim());
        } catch (Exception e) {
            startIndex = 0;
            System.out.println("Invalid input. Start index replaced by default value 0");
        }

        System.out.println("Type max results or press enter to continue: ");
        Integer maxResults;
        try {
            maxResults = Integer.parseInt(in.nextLine().trim());
        } catch (Exception e) {
            maxResults = 0;
            System.out.println("Invalid input. Max results replaced by default value 0");
        }

        System.out.println("Type print type or press enter to continue: ");
        String printType = in.nextLine().trim();
        if (printType.equals("")) {
            printType = "";
        }

        System.out.println("Type projection type or press enter to continue: ");
        String projection = in.nextLine().trim();
        if (projection.equals("")) {
            projection = "";
        }

        System.out.println("Type order by or press enter to continue: ");
        String orderBy = in.nextLine().trim();
        if (orderBy.equals("")) {
            orderBy = "";
        }

        Volumes volumes = performingSearch(
                query, intitles, subject, inauthors, isbn, download, filtering, langRestrict,
                startIndex, maxResults, printType, projection, orderBy, API_KEY
        );
        return volumes;
    }


    public static Volume viewInformationAboutASpecificVolume() throws URISyntaxException, IOException {
        Scanner in = new Scanner(System.in);
        String volumeId;
        while (true) {
            System.out.println("Type Volume Id: ");
            volumeId = in.nextLine().trim();
            if (volumeId.equals("")) {
                System.out.println("Volume Id is required!");
            } else {
                break;
            }
        }
        Volume volume = retrievingVolume(volumeId, API_KEY);
        return volume;
    }


    public static String[] searchHistory() throws IOException {
        return readFile().split("\n");
    }


    public static void searchHistoryOption() throws IOException {
        String[] history = searchHistory();
        System.out.println("+--------------------------------------------------+");
        System.out.println("|                   History                        |");
        System.out.println("+--------------------------------------------------+");
        for (int i = 0; i < history.length; i++) {
            System.out.println(String.format("| %d. %-45s |", i+1, history[i]));
        }
        System.out.println("+--------------------------------------------------+");
        System.out.println();
    }

}
