package Seminar2;

import java.util.ArrayList;

class LibraryBooks{
    public String bAutor;
    public String bName;
    public String bLang;
}

public class Library extends Book {
    // private String BookAutor;
    // private String BookName;
    // private String BookLang;

    public String LibraryName;

    public Library(String libraryName) {
        this.LibraryName = libraryName;
    }

    ArrayList<LibraryBooks> listBook = new ArrayList<>();

    public void AddBook(String bookAutor, String bookName, String bookLang) {
        SetBookAutor(bookAutor);
        SetBookName(bookName);
        SetBookLang(bookLang);
        LibraryBooks lb = new LibraryBooks();
        lb.bAutor = GetBookAutor();
        lb.bName = GetBookName();
        lb.bLang = GetBookLang();
        listBook.add(lb);
    }

    public ArrayList<LibraryBooks> getBookList() {
        return listBook;
    }
}
