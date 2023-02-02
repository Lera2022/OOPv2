package Seminar2;

import java.util.ArrayList;

public class Persona extends Human{
    // public String FullName;
    public Library PersLibr;

    public Persona(String Name, String Gender, int Age, String persLibr) {
        SetName(Name);
        SetGender(Gender);
        SetAge(Age);
        this.PersLibr = new Library(persLibr);
    }

    // public void AddBookToPerson(String bookAutor, String bookName, String bookLang){
    //     PersLibr.AddBook(bookAutor, bookName, bookLang);
    // }

    ArrayList<Persona> listName = new ArrayList<>();

    public void AddName(Persona persona) {
        listName.add(persona);
    }

    public ArrayList<Persona> getListName() {
        return listName;
    }

    public String FullName() {
        return null;
    }

    @Override
    public void Voice() {
        String name = GetName();
        System.out.println("Hello, my name is " + name);

    }

}
