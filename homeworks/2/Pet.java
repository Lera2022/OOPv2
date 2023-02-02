package Homework2;

public abstract class Pet {
    private String PetType;
    private String PetNickName;
    private String PetLang;

    public void SetPetType(String PetType){
        this.PetType = PetType;
    }

    public void SetPetNickname(String PetNickname){
        this.PetNickName = PetNickname;
    }

    public void SetPetLang(String PetLang){
        this.PetLang = PetLang;
    }

    public String GetPetType(){
        return PetType;
    }

    public String GetPetNickName(){
        return PetNickName;
    }

    public String GetPetLang(){
        return PetLang;
    }

}
