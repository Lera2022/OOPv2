import java.util.ArrayList;

public class Incorporated {
    String corpName;
    String corpDept;

    ArrayList<Group> groupsInCorp = new ArrayList<>();

    public void incorporated(String CorpName, String CorpDept){
        this.corpName = CorpName;
        this.corpDept = CorpDept;
    }

    public String getCorpName() {
        return corpName;
    }

    public String getCorpDept() {
        return corpDept;
    }
}