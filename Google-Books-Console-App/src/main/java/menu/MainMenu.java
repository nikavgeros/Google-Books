package menu;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import static menu.searchVolumeMenu.SearchVolumeMenu.searchVolumesMenu;
import static menu.shelfManagementMenu.ShelfManagementMenu.searchShelfManagementMenu;


public class MainMenu {

    public static void displayMainMenu() {
        System.out.println("+--------------------------------------------------+");
        System.out.println("|                     Main Menu                    |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| 1.  Search volumes                               |");
        System.out.println("| 2.  Shelf management                             |");
        System.out.println("| 3.  Exit                                         |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("Select option: ");
    }

    public static void start() throws URISyntaxException, IOException {
        int close = -1;
        int choice = -1;
        Scanner in = new Scanner(System.in);
        do {
            displayMainMenu();
            try {
                choice = Integer.parseInt(in.nextLine());
            } catch (Exception e){
                choice = -1;
            }

            close = choice;
            switch (choice) {
                case 1:
                    searchVolumesMenu();
                    break;
                case 2:
                    searchShelfManagementMenu();
                    break;
                case 3:
                    close = 3;
                    break;
                default:
                    System.out.println("Invalid input. Please try again");
            }
        } while (close != 3);
    }
}