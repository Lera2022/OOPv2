import java.util.ArrayList;

public class Man {
    int id;
    String name;
    boolean woman;
    int year;

    @Override
    public String toString() {
        return String.format("ID: %d Name: %s  Woman: %b  Year: %d", id, name, woman, year);
    }


    public Man(int id, String name, boolean woman, int year) {
        this.id = id;
        this.name = name;
        this.woman = woman;
        this.year = year;
    }

    ArrayList <Man> listName = new ArrayList<>();

    public void AddChild(Man persona){
        listName.add(persona);
    }

    public String GetName (){
        return name;
    }

    public ArrayList <Man> getListName(){
        return listName;
    }

    public String getInfo() {
        return String.format("ID: %d Name: %s  Woman: %b  Year: %d",
                this.id, this.name, this.woman, this.year);
    }

}
