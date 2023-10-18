import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;


public class ListGUI extends Member {
    private JButton createButton;
    private JButton removeButton;
    private JButton logoutButton;
    private String email;

    public ListGUI(){
    }

    public ListGUI(String email){
        super(email);
    }

    class ButtonAction implements ActionListener{
        public void actionPerformed(ActionEvent e) {    
          Object source = e.getSource();
        }
    }
    public Component createComponents(){
        // Create the main panel
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
        return panel;
  }


  public static void main(String[] args) {
    JFrame frame = new JFrame("To Do List");
    ListGUI app = new ListGUI();
    Component contents = app.createComponents();
    frame.getContentPane().add(contents, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}