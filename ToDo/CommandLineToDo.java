import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CommandLineToDo {
    private static List<Member> memberslist= new ArrayList<>();
    private static UserCredentialsManager manager = new UserCredentialsManager();
    public static Member currentUser;

    public static Member getUser(String username){
        for(int i = 0; i < memberslist.size(); i++){
            if(memberslist.get(i).getUsername().equals(username))
                return memberslist.get(i);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean login_status=false;
        boolean app_status=true;
        while(app_status){
            while(!login_status){
                    System.out.print("Press 1 for Login, Press 2 for Sign Up: ");
                    String status = scanner.nextLine();
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password:");
                    String password = scanner.nextLine();

                    if(status.equals("1")){    
                        //check if username and password matches
                        if(manager.checkCredentials(username, password)){
                            //get this user's ToDoList from memberslist
                            currentUser = getUser(username);
                            System.out.println("Logged!");  
                            login_status = true;
                        }
                    } else {
                        //add username, password pair 
                        manager.addUserCredentials(username, password);
                        //create ToDoList for this member and make it the userToDoList
                        currentUser = new Member(username);
                        //add ToDoList to the memberslist to allow access on the next login
                        memberslist.add(currentUser);
                        System.out.println("Welcome!");
                        login_status = true;
                    }
                }

                while (login_status) {
                    System.out.println("1. Add Task");
                    System.out.println("2. Display Tasks");
                    System.out.println("3. Remove Task");
                    System.out.println("4. Logout");
                    System.out.println("5. Exit");
                    System.out.print("Enter your choice: ");

                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    switch (choice) {
                        case 1:
                            System.out.print("Enter the task: ");
                            String task = scanner.nextLine();
                            System.out.print("Enter accessible user: ");
                            String inputString = scanner.nextLine();
                            String[] users = inputString.split(",");
                            currentUser.addTask(task, users);
                            break;
                        case 2:
                            System.out.println("To-Do List:");
                            for(int i = 0; i < memberslist.size(); i++)
                                memberslist.get(i).displayTasks(currentUser.username);
                            break;
                        case 3:
                            System.out.print("Enter the index of the task to remove: ");
                            int index = scanner.nextInt();
                            currentUser.removeTask(index - 1);
                            break;
                        case 4:
                            System.out.println("Logging out...");
                            login_status = false;
                            break;
                        case 5:
                            System.out.println("Exitting...");
                            login_status = false;
                            scanner.close();
                            app_status = false;
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a valid option.");
                    }

                    System.out.println();
            }
        }  
        System.exit(1);
    }
}
