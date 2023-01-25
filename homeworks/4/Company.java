import java.util.ArrayList;

public class Company {
    String cName;
    public Company(String c_Name){
        this.cName = c_Name;
    }

    ArrayList<Group> groups = new ArrayList<>();

    public void addGroup(Group group){
        groups.add(group);
    }

    public ArrayList<Group> getGroups(){
        return groups;
    }
}
