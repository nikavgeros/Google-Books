# Google-Books

Google Books is a service of Google Inc. that enables full-text searching
books and magazines, which Google has scanned using optical character recognition
(OCR) and has stored them in its digital database.
<br/>
As part of this work an application should be developed to search for books and
journals in the Google database. The work will be done in 2 parts:

## PART 1: Building Books API library
In the context of the 1st part, the classes through which the search will be carried out should be implemented
volumes of books and magazines (volumes) based on specific criteria and the public ones will be retrieved
bookshelves of other users. Specifically, the classes that will be developed will implement them
following functions:
<ul>
  <li>
    Search volumes of books and magazines (volumes), based on specific criteria, such as:
    <ul>
      <li>Words or phrases included in the title of the book, in its category, in author, publisher and ISBN of the book (required parameter).</li>
      <li>File format of the digitized book (e.g. epub)</li>
      <li>Preview availability (eg partial, full etc.)</li>
      <li>
        Every possible parameter, which is listed in its Optional Parameters subsection
        Performing Search section of the relevant documentation. This documentation is available at 
        https://developers.google.com/books/docs/v1/using#PerformingSearch.
      </li>
    </ul>
  </li>
  <li>
    Retrieve more information for each volume returned by the search. Specifically, 
    when the user selects a volume from the list of search results, it should 
    the complete set of information pertaining to the selected book volume is returned or magazine 
    (https://developers.google.com/books/docs/v1/using#RetrievingVolume ).
  </li>
  <li>
    Retrieve a list of public bookshelves of another user 
    (https://developers.google.com/books/docs/v1/using#RetrievingBookshelves ).
  </li>
  <li>
    Retrieve more information about each other user's public shelf
    (https://developers.google.com/books/docs/v1/using#RetrievingBookshelf 
  </li>
  <li>
    Retrieve contents of another user's public shelf. Specifically, it will be selectable
    any public shelf of another user and retrieve the volumes contained in 
    this one (https://developers.google.com/books/docs/v1/using#RetrievingBookshelfVolumes).
  </li>
</ul>
  
The download of all the above data will be done in real time through the REST API which
provided by Google. The classes that will be developed as part of the 1st part of the work will
handle all communication with the REST API, ie:
<ul>
  <li>API call to retrieve shelves and volumes that meet specific criteria.</li>
  <li>Get all rack and volume data in JSON or XML format (JSON/XML response).</li>
  <li>
    Deserialization of the JSON/XML response to the relevant java objects. 
    For this purpose, the corresponding POJO (Plain Old Java Object) classes should also be implemented, 
    objects of which will be used to store the data that will are extracted from the JSON response.
  </li>
</ul>

Then, from the above classes, a library (.jar file) will be constructed, which will
installed in the local maven repository so that the functionality it provides can
easily integrated and leveraged by any Java application.


## PART 2: Building an application to access Google Books
In the context of the 2nd part of the work, a java application (console, GUI or web-based) will be developed
application) which will provide users with the following options:
<ol>
  <li>Search volumes based on any combination of the available criteria (of those that have defined in the 1st part of the paper).</li>
  <li>Saving the last 5 searches performed by the user.</li>
  <li>Retrieve and display detailed information for each of the search results.</li>
  <li>Retrieving another user's public shelves and, more specifically, the user with code uid=102701940585560677579.</li>
  <li>Retrieving contents of public shelves of the above user.</li>
</ol>
