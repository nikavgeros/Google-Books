package menu.searchVolumeMenu;

import org.pojos.performingSearch.Volumes;
import org.pojos.retrievingVolume.Volume;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Scanner;
import static menu.searchVolumeMenu.options.SearchVolumeOptions.*;


public class SearchVolumeMenu {


    public static void displaySearchVolumesMenu() {
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
                    Volumes volumes = searchVolumesBasedOnCriteria();
                    System.out.println(volumes.toString());
                    break;
                case 2:
                    Volume volume = viewInformationAboutASpecificVolume();
                    System.out.println(volume.toString());
                    break;
                case 3:
                    searchHistoryOption();
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

}
