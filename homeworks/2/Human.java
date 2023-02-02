package Homework2;

public abstract class Human {
    private String gender;
    private String name;
    private int age;

    public void SetGender(String Gender){
        this.gender = Gender;
    }

    public void SetName(String Name){
        this.name = Name;
    }

    public void SetAge(int Age){
        this.age = Age;
    }

    public String GetGender(){
        return gender;
    }

    public String GetName(){
        return name;
    }

    public int GetAge(){
        return age;
    }

    public abstract void Voice();
}
