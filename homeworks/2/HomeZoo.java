package Homework2;

import java.util.ArrayList;

class HomeZooPets{
    public String pType;
    public String pNickname;
    public String pLang;
}

public class HomeZoo extends Pet {

    public String HomeZooName;

    public HomeZoo(String homeZooName) {
        this.HomeZooName = homeZooName;
    }

    ArrayList<HomeZooPets> listPets = new ArrayList<>();

    public void AddPet(String petType, String petNickname, String petLang) {
        SetPetType(petType);
        SetPetNickname(petNickname);
        SetPetLang(petLang);
        HomeZooPets hz = new HomeZooPets();
        hz.pType = GetPetType();
        hz.pNickname = GetPetNickName();
        hz.pLang = GetPetLang();
        listPets.add(hz);
    }

    public ArrayList<HomeZooPets> getPetsList() {
        return listPets;
    }
}
