package menu.shelfManagementMenu;

import org.pojos.retrievingBookshelf.Bookshelf;
import org.pojos.retrievingBookshelfVolume.BookshelfVolumes;
import org.pojos.retrievingBookshelves.Bookshelves;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import static menu.shelfManagementMenu.options.ShelfManagementOptions.*;


public class ShelfManagementMenu {


    public static void displaySearchSelfManagement() {
        System.out.println("+--------------------------------------------------+");
        System.out.println("|                 Shelf Management Menu            |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| 1.  Retrieve a list of user public shelves       |");
        System.out.println("| 2.  View information about a user's public shelf |");
        System.out.println("| 3.  Retrieve user public shelf contents          |");
        System.out.println("| 4.  Back to Main Menu                            |");
        System.out.println("| 5.  Exit                                         |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("Select option: ");
    }


    public static void searchShelfManagementMenu() throws URISyntaxException, IOException {
        int back = -1;
        int choice = -1;
        Scanner in = new Scanner(System.in);
        do {
            displaySearchSelfManagement();
            try {
                choice = Integer.parseInt(in.nextLine());
            } catch (Exception e){
                choice = -1;
            }

            switch (choice) {
                case 1:
                    Bookshelves bookshelves = retrieveAListOfUserPublicShelves();
                    System.out.println(bookshelves.toString());
                    break;
                case 2:
                    Bookshelf bookshelf = viewInformationAboutAUsersPublicShelf();
                    System.out.println(bookshelf.toString());
                    break;
                case 3:
                    BookshelfVolumes bookshelfVolumes = retrieveUserPublicShelfContents();
                    System.out.println(bookshelfVolumes.toString());
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