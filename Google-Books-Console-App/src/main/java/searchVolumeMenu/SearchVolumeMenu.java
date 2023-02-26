package searchVolumeMenu;

import org.pojos.performingSearch.Volumes;
import org.pojos.retrievingVolume.Volume;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.api.GoogleBookAPI.performingSearch;
import static org.api.GoogleBookAPI.retrievingVolume;
import static org.utils.Utils.API_KEY;

public class SearchVolumeMenu {


    public static void displaySearchVolumesMenu(){
        System.out.println("+--------------------------------------------------+");
        System.out.println("|                   Volumes Menu                   |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| 1.  Search volumes based on criteria             |");
        System.out.println("| 2.  View information about a specific volume     |");
        System.out.println("| 3.  Search history                               |");
        System.out.println("| 4.  Back to Main Menu                            |");
        System.out.println("| 5.  Exit                                         |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("Select option: ");
    }

    public static void searchVolumesMenu() throws URISyntaxException, IOException {
        int back = -1;
        int choice = -1;
        Scanner in = new Scanner(System.in);
        do {
            displaySearchVolumesMenu();
            try {
                choice = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    Volumes volumes = SearchVolumesBasedOnCriteria();
                    System.out.println(volumes.getItems().get(4).getVolumeInfo().toString());
                    break;
                case 2:
                    Volume volume = viewInformationAboutASpecificVolume();
                    System.out.println(volume.getVolumeInfo().toString());
                    break;
                case 3:
                    String history = searchHistory();
                    System.out.println(history);
                    break;
                case 4:
                    back = choice;
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please try again");
            }
        } while (back != 4);
    }

    public static Volumes SearchVolumesBasedOnCriteria() throws URISyntaxException, IOException {
        Scanner in = new Scanner(System.in);
        String query;
        while (true) {
            System.out.println("Type query: ");
            query = in.nextLine().trim();
            if (query.equals("")) {
                System.out.println("Query is required!");
            } else {
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

    public static String searchHistory() throws IOException {
        String filename = "C:\\Users\\user\\Desktop\\Projects\\Java Projects\\Google Books\\Google-Books-Console-App\\searchHistory.txt";
        String history = "";
        StringBuilder sb = new StringBuilder();

        try(BufferedReader bf = new BufferedReader(new FileReader(filename))){
            System.out.println(bf.readLine());
//            while ((history=bf.readLine())!=null) {
//
//                sb.append(history).append("\n");
//            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            File searchHistoryFile = new File(filename);
            searchHistoryFile.createNewFile();
            System.out.println("File " + searchHistoryFile +" has been created");
        } catch (IOException e) {
            System.out.println(e);
        }

        return history;
    }
}
