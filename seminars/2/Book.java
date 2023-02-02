package Seminar2;

public abstract class Book {
    private String BookAutor;
    private String BookName;
    private String BookLang;

    public void SetBookAutor(String BookAutor){
        this.BookAutor = BookAutor;
    }

    public void SetBookName(String BookName){
        this.BookName = BookName;
    }

    public void SetBookLang(String BookLang){
        this.BookLang = BookLang;
    }

    public String GetBookAutor(){
        return BookAutor;
    }

    public String GetBookName(){
        return BookName;
    }

    public String GetBookLang(){
        return BookLang;
    }

}
