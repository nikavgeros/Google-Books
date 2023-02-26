package menu.shelfManagementMenu.options;

import org.pojos.retrievingBookshelf.Bookshelf;
import org.pojos.retrievingBookshelfVolume.BookshelfVolumes;
import org.pojos.retrievingBookshelves.Bookshelves;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import static org.api.GoogleBookAPI.*;
import static org.utils.Utils.API_KEY;
import static utils.Utils.getDefaultUserId;


public class ShelfManagementOptions {


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
