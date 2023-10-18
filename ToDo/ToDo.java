import java.util.ArrayList;
import java.util.List;

public class ToDo {
    private String task;
    private List<String> access= new ArrayList<String>();

    public ToDo(String task) {
        this.task = task;
    }

    public List<String> getAccess(){
        return this.access;
    }
    
    public void giveAccess(String username){
        this.access.add(username);

    }

    public void removeAccess(String username){
        this.access.remove(username);
    }

    public String getTask() {
        return task;
    }
}
