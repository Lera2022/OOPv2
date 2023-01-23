import java.util.ArrayList;

public class Group extends Department {



    public Group (String GroupName){
        setDeptName(GroupName);
    }



    public void addPeople(Persona persona){
        personaInDept.add(persona);
    }

    @Override
    public String toString() {
        return brand;
    }
}