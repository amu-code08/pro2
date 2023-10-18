import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class Prob103 {
  private static String labelPrefix = "Your input: ";;
  private JLabel label;
  private JTextField inputfield;


  class ButtonAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
     
      label.setText(labelPrefix + inputfield.getText());
    }
  }

  public Component createComponents() {
    label = new JLabel(labelPrefix);
    JButton button = new JButton("Press me!");
    inputfield = new JTextField();
    ButtonAction buttonListener = new ButtonAction();
    button.addActionListener( buttonListener );

    JPanel pane = new JPanel();
    pane.setBorder(BorderFactory.createEmptyBorder( 30, 30, 10, 30 ));
    pane.setLayout(new GridLayout(0, 1));
    pane.add(inputfield);
    pane.add(button);
    pane.add(label);

    return pane;
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("SwingApplication");
    Prob103 app = new Prob103();
    Component contents = app.createComponents();
    frame.getContentPane().add(contents, BorderLayout.CENTER);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
