import java.util.ArrayList;

public class Persona {
    private String FullName;
    public Persona(String Name) {
        this.FullName = Name;
    }
    ArrayList <Persona> listName = new ArrayList<>();
    public void AddName(Persona persona){
        listName.add(persona);
    }
    public String GetName (){
        return FullName;
    }
    public ArrayList <Persona> getListName(){
        return listName;
    }
}
