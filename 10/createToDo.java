import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class createToDo{
    private JTextField tasknameField;
    private JTextArea contentArea;
    private JTextField createdDateField;
    private JTextField dueDateField;
    private JTextField priorityField;
    private JButton cancelButton;
    private JButton saveButton;

    class ButtonAction implements ActionListener{
        public void actionPerformed(ActionEvent e) {    
          Object source = e.getSource();

          if(source == saveButton){
            tasknameField.setText("");
          }
        }
    }

    public Component createComponents() {
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

        // Create the content area
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout());
        JLabel contentLabel = new JLabel("Content: ");
        contentArea = new JTextArea(5, 20);
        contentPanel.add(contentLabel);
        contentPanel.add(contentArea);
        panel.add(contentPanel);

        // Create the created date field
        JPanel createdDatePanel = new JPanel();
        createdDatePanel.setLayout(new FlowLayout());
        JLabel createdDateLabel = new JLabel("Created Date: ");
        createdDateField = new JTextField(20);
        createdDatePanel.add(createdDateLabel);
        createdDatePanel.add(createdDateField);
        panel.add(createdDatePanel);

        // Create the due date field
        JPanel dueDatePanel = new JPanel();
        dueDatePanel.setLayout(new FlowLayout());
        JLabel dueDateLabel = new JLabel("Due Date: ");
        dueDateField = new JTextField(20);
        dueDatePanel.add(dueDateLabel);
        dueDatePanel.add(dueDateField);
        panel.add(dueDatePanel);

        // Create the priority field
        JPanel priorityPanel = new JPanel();
        priorityPanel.setLayout(new FlowLayout());
        JLabel priorityLabel = new JLabel("Priority: ");
        priorityField = new JTextField(20);
        priorityPanel.add(priorityLabel);
        priorityPanel.add(priorityField);
        panel.add(priorityPanel);

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

        // Add the panel to the frame
        return panel;
  }


  public static void main(String[] args) {
    JFrame frame = new JFrame("To Do List");
    createToDo app = new createToDo();
    Component contents = app.createComponents();
    frame.getContentPane().add(contents, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}