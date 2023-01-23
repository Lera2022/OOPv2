import java.util.ArrayList;






public class Department {
    String deptName;
    String deptWorker;

    ArrayList<Persona> personaInDept = new ArrayList<>();

    
    public void setDeptName (String deptName) {
        this.deptName = deptName;
    }
}