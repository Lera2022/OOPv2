import java.util.ArrayList;

public class Group extends Department {



    public Group (String GroupName){
        setDeptName(GroupName);
    }



    public void addPeople(Persona persona){
        personaInDept.add(persona);
    }

    public void putAwayPeople(Persona persona){
        personaInDept.remove(persona);
    }
}