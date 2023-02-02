package Homework2;

import java.util.ArrayList;

public class Persona extends Human{
    // public String FullName;
    public HomeZoo PersZoo;

    public Persona(String Name, String Gender, int Age, String persZoo) {
        SetName(Name);
        SetGender(Gender);
        SetAge(Age);
        this.PersZoo = new HomeZoo(persZoo);
    }

    // public void AddPetToPerson(String PetType, String PetNickname, String PetLang){
    //     PersZoo.AddPet(PetType, PetNickname, PetLang);
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
