

public class Worker {
    String workUsername;
    int workAge;
    String workRegal;

    public void worker (String WorkUsername, String WorkRegal, int WorkAge){
        this.workUsername = WorkUsername;
        this.workRegal = WorkRegal;
        this.workAge = WorkAge;
    }

    public String getWorkUsername(){
        return workUsername;
    }
    public String getWorkRegal(){
        return workRegal;
    }
    public String getWorkAge(){
        return workAge;
    }
}