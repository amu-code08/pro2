import java.util.ArrayList;
import java.util.List;

public class Member {
    public String username;
    private List<ToDo> toDoList;

    public Member(String username) {
        this.username = username;
        toDoList = new ArrayList<>();
    }

    public void addTask(String task, String[] users) {
        ToDo newtask = new ToDo(task);
        for (String user : users) {
            newtask.giveAccess(user);          
        }
        toDoList.add(newtask);
    }

    public void displayTasks(String username) {
        for (int i = 0; i < toDoList.size(); i++) {
            if(toDoList.get(i).getAccess().contains(username))
                System.out.println((i + 1) + ". " + toDoList.get(i).getTask());
        }
    }

    public String getUsername(){
        return username;
    }

    public void removeTask(int index) {
        if (index >= 0 && index < toDoList.size()) {
            toDoList.remove(index);
        } else {
            System.out.println("Invalid index. Please provide a valid index.");
        }
    }
}
