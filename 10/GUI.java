import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class GUI extends Member{
  //CARD LAYOUTS
  public static JPanel cardPanel;
  public static CardLayout layout;

  //LOG-IN COMPONENTS
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton signupButton;
    private String email;
    private String password;
    private static Map<String, String> dictionary;
    private static Member user;
    private static Map<String, Member> userList;

  //LIST COMPONENTS
    private JButton createButton;
    private JButton removeButton;
    private JButton logoutButton;

  //CREATE COMPONENTS
  private JTextField tasknameField;
  private JTextArea contentArea;
  private JTextField createdDateField;
  private JTextField dueDateField;
  private JTextField priorityField;
  private JButton cancelButton;
  private JButton saveButton;

  //TASK DATA
  String n;
  String c;
  String cdate;
  String ddate;
  String p;

  public static void goToList(Member user){
    System.out.println("your personal page");
    layout.show(cardPanel, "panel02");
  } 

  public static void logout(Member user){
    System.out.println("Logged out");
    layout.show(cardPanel, "panel01");
    user = null;
  }

  public GUI(){

  }

  public GUI(String email){
    super(email);
  }


  private static void login(String email, String password) {
    System.out.println(dictionary.get(email));
    if (password.equals(dictionary.get(email))){
      System.out.println("Success!");
      user = userList.get(email);
      goToList(user);
    } else {
      System.out.println("Wrong password!");
    }
  }

  private static void signup(String email, String password){
    if(dictionary.containsKey(email)){
      System.out.println("You already have an account");
    } else {
      dictionary.put(email, password);
      System.out.println("Dictionary written");
      user = new GUI(email);
      userList.put(email, user);
      goToList(user);
    }
  }

  private static void movetoC(Member user) {
    System.out.println("create todo");
    layout.show(cardPanel, "panel03");
  }

  class ButtonAction implements ActionListener{
    public void actionPerformed(ActionEvent e) {    
      Object source = e.getSource();
      email = usernameField.getText();

      char[] passwordChars = passwordField.getPassword();
      password = new String(passwordChars);
      Arrays.fill(passwordChars, ' ');

      if (source == loginButton){
        login(email, password);
      } else if (source == signupButton) {
        signup(email, password);
      } else if (source == logoutButton) {
        logout(user);
      } else if (source == createButton) {
        movetoC(user);
      } else if (source == cancelButton) {
        goToList(user);
      } else if (source == saveButton){
        tasknameField.setText("");
      }
    }
  }

  public Component createLogInComponents() {
      //create dictionary
      dictionary = new HashMap<>();
      userList = new HashMap<>();

      // Create the main panel
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(3, 1));

      // Create the username field
      JPanel usernamePanel = new JPanel();
      usernamePanel.setLayout(new FlowLayout());
      JLabel usernameLabel = new JLabel("Email: ");
      usernameField = new JTextField(20);
      usernamePanel.add(usernameLabel);
      usernamePanel.add(usernameField);
      panel.add(usernamePanel);

      // Create the password field
      JPanel passwordPanel = new JPanel();
      passwordPanel.setLayout(new FlowLayout());
      JLabel passwordLabel = new JLabel("Password: ");
      passwordField = new JPasswordField(20);
      passwordPanel.add(passwordLabel);
      passwordPanel.add(passwordField);
      panel.add(passwordPanel);

      // Create the login button
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new FlowLayout());
      loginButton = new JButton("Log In");
      signupButton = new JButton("Sign Up");

      buttonPanel.add(loginButton);
      buttonPanel.add(signupButton);
      panel.add(buttonPanel);

      ButtonAction buttonListener = new ButtonAction();
      loginButton.addActionListener( buttonListener );
      signupButton.addActionListener( buttonListener );
      // Add the panel to the frame
      return panel;
  }

  public Component createListComponents(){
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(6, 4));

    JPanel infoPanel = new JPanel();
    JLabel infoLabel = new JLabel("id: ");
    infoPanel.add(infoLabel);
    panel.add(infoPanel);

    JPanel taskPanel = new JPanel();
    JLabel taskLabel = new JLabel("task: ");
    taskPanel.add(taskLabel);
    panel.add(taskPanel);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout());
    createButton = new JButton("Create task");
    removeButton = new JButton("Remove task");
    logoutButton = new JButton("Log Out");
    buttonPanel.add(createButton);
    buttonPanel.add(removeButton);
    buttonPanel.add(logoutButton);
    panel.add(buttonPanel);     

    ButtonAction buttonListener = new ButtonAction();
    createButton.addActionListener( buttonListener );
    logoutButton.addActionListener(buttonListener);
    createButton.addActionListener(buttonListener);

    return panel;
  }

  public Component createcreateTodoComponents() {
    // Create the main panel
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(6, 4));

    // Create the taskname field
    JPanel tasknamePanel = new JPanel();
    tasknamePanel.setLayout(new FlowLayout());
    JLabel tasknameLabel = new JLabel("Name: ");
    tasknameField = new JTextField(20);
    tasknamePanel.add(tasknameLabel);
    tasknamePanel.add(tasknameField);
    panel.add(tasknamePanel);
    n = tasknameField.getText();

    // Create the content area
    JPanel contentPanel = new JPanel();
    contentPanel.setLayout(new FlowLayout());
    JLabel contentLabel = new JLabel("Content: ");
    contentArea = new JTextArea(5, 20);
    contentPanel.add(contentLabel);
    contentPanel.add(contentArea);
    panel.add(contentPanel);
    c = contentArea.getText();

    // Create the created date field
    JPanel createdDatePanel = new JPanel();
    createdDatePanel.setLayout(new FlowLayout());
    JLabel createdDateLabel = new JLabel("Created Date: ");
    createdDateField = new JTextField(20);
    createdDatePanel.add(createdDateLabel);
    createdDatePanel.add(createdDateField);
    panel.add(createdDatePanel);
    cdate = createdDateField.getText();

    // Create the due date field
    JPanel dueDatePanel = new JPanel();
    dueDatePanel.setLayout(new FlowLayout());
    JLabel dueDateLabel = new JLabel("Due Date: ");
    dueDateField = new JTextField(20);
    dueDatePanel.add(dueDateLabel);
    dueDatePanel.add(dueDateField);
    panel.add(dueDatePanel);
    ddate = dueDateField.getText();

    // Create the priority field
    JPanel priorityPanel = new JPanel();
    priorityPanel.setLayout(new FlowLayout());
    JLabel priorityLabel = new JLabel("Priority: ");
    priorityField = new JTextField(20);
    priorityPanel.add(priorityLabel);
    priorityPanel.add(priorityField);
    panel.add(priorityPanel);
    p = priorityField.getText();

    // Create the button
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout());
    cancelButton = new JButton("Cancel");
    saveButton = new JButton("Save");
    buttonPanel.add(cancelButton);
    buttonPanel.add(saveButton);
    panel.add(buttonPanel);

    ButtonAction buttonListener = new ButtonAction();
    saveButton.addActionListener(buttonListener);
    cancelButton.addActionListener(buttonListener);

    // Add the panel to the frame
    return panel;
  }

  public static void main(String[] args) {
    GUI app = new GUI();
    JFrame frame = new JFrame("GUI");
    Component logincomponents = app.createLogInComponents();
    Component listcomponents = app.createListComponents();
    Component createTodocomponents = app.createcreateTodoComponents();
    cardPanel = new JPanel();
    layout = new CardLayout();
    cardPanel.setLayout(layout);
    cardPanel.add(logincomponents, "panel01");
    cardPanel.add(listcomponents, "panel02");
    cardPanel.add(createTodocomponents, "panel03");
  
    frame.getContentPane().add(cardPanel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}

