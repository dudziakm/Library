public class Book {
    String title ;
    String author ;
    int releaseDate;
    int pages ;
    String publisher ;
    String isbn ;

    Book(String bookTitle, String bookauthor, int bookreleaseDate, int bookpages, String bookpublisher, String bookisbn) {
        title = bookTitle;
        author  = bookauthor;
        releaseDate = bookreleaseDate;
        pages = bookpages;
        publisher = bookpublisher;
        isbn = bookisbn;
    }

    void printInfo(){
        String info = title + "; " + author + "; " + releaseDate + "; "
                + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }

}
