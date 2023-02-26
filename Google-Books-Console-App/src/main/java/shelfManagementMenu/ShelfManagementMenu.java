package shelfManagementMenu;

import org.pojos.retrievingBookshelf.Bookshelf;
import org.pojos.retrievingBookshelfVolume.BookshelfVolumes;
import org.pojos.retrievingBookshelves.Bookshelves;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import static org.api.GoogleBookAPI.*;
import static org.utils.Utils.API_KEY;
import static utils.Utils.getDefaultUserId;


public class ShelfManagementMenu {


    public static void displaySearchSelfManagement(){
        System.out.println("+--------------------------------------------------+");
        System.out.println("|                 Self Management Menu             |");
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


    public static Bookshelves retrieveAListOfUserPublicShelves() throws URISyntaxException, IOException {
        Bookshelves bookshelves = retrievingBookshelves(getDefaultUserId(), API_KEY);
        return bookshelves;
    }


    public static Bookshelf viewInformationAboutAUsersPublicShelf() throws URISyntaxException, IOException {
        Scanner in = new Scanner(System.in);
        int bookshelfId;

        while (true) {
            System.out.println("Type bookshelf Id: ");
            try {
                bookshelfId = Integer.parseInt(in.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Invalid id");
            }
        }
        Bookshelf bookshelf = retrievingBookshelf(getDefaultUserId(), bookshelfId, API_KEY);
        return bookshelf;
    }


    public static BookshelfVolumes retrieveUserPublicShelfContents() throws URISyntaxException, IOException {
        Scanner in = new Scanner(System.in);
        int bookshelfId;

        while (true) {
            System.out.println("Type bookshelf Id: ");
            try {
                bookshelfId = Integer.parseInt(in.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Invalid id");
            }
        }
        BookshelfVolumes bookshelfVolumes = retrievingBookshelfVolumes(getDefaultUserId(), bookshelfId, API_KEY);
        return bookshelfVolumes;
    }

}