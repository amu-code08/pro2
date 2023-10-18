public class Todo {

    public static String name;
    public static String content;
    public static String createdDate;
    public static String dueDate;
    public static int priority;

    public Todo(){
    }

    public Todo(String n, String c, String cdate, String ddate, int p){
        name = n;
        content = c;
        createdDate = cdate;
        dueDate = ddate;
        priority = p;
    }

    public static void deleteToDo(Todo n){
        n = null;
    }
}
