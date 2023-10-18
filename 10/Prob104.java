import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class Prob104 {
  private static String labelPrefix = "Your input: ";;
  private JLabel label;
  private float num1=0;
  private float num2=0; 
  private char op;
  private String display="";
  private int flag = 0;
 

  class ButtonAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JButton source = (JButton) e.getSource();
      String input = source.getText();
      char c = input.charAt(0);
      display += c;
      label.setText(display);
      if(flag == 0){
        switch(c){
          case '0':
            num1 = num1*10;
            break;
          case '1':
            num1 = num1*10+1;
            break;
          case '2':
            num1 = num1*10+2;
            break;
          case '3':
            num1 = num1*10+3;
            break;
          case '4':
            num1 = num1*10+4;
            break;
          case '5':
            num1 = num1*10+5;
            break;
          case '6':
            num1 = num1*10+6;
            break;
          case '7':
            num1 = num1*10+7;
            break;
          case '8':
            num1 = num1*10+8;
            break;
          case '9':
            num1 = num1*10+9;
            break;
          case '=':
            label.setText(num1+"");
            break;
          case 'C':
            num1 = 0; 
            num2 = 0;
            display = "";
            flag = 0;
            op='\0';
            label.setText("0");
            break;
          default:
            op=c;
            flag = 1;
        }
      } else {
        switch(c){
          case '0':
            num2 = num2*10;
            break;
          case '1':
            num2 = num2*10+1;
            break;
          case '2':
            num2 = num2*10+2;
            break;
          case '3':
            num2 = num2*10+3;
            break;
          case '4':
            num2 = num2*10+4;
            break;
          case '5':
            num2 = num2*10+5;
            break;
          case '6':
            num2 = num2*10+6;
            break;
          case '7':
            num2 = num2*10+7;
            break;
          case '8':
            num2 = num2*10+8;
            break;
          case '9':
            num2 = num2*10+9;
            break;
          case  'C':
            num1 = 0; 
            num2 = 0;
            display = "";
            flag = 0;
            label.setText("0");
            break;
          default:
            switch(op){
              case '+':
                num1 = num1+num2;
                break;
              case '-':
                num1 = num1-num2;
                break;
              case 'x':
                num1 = num1*num2;
                break;
              case '/':
                num1 = num1/num2;
                break;
              default:
            }
            num2 = 0;
            if(c == '='){
              display=num1+"";
              label.setText(display);
              flag = 0;
            } else {
              op = c;
            }
            
        }
      }
    }
  }

  public Component createComponents() {
    label = new JLabel(labelPrefix);
    
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");

    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonTimes = new JButton("x");
    JButton buttonDivide = new JButton("/");

    JButton buttonClear = new JButton("C");
    JButton buttonEquals = new JButton("=");

    ButtonAction buttonListener = new ButtonAction();
    button0.addActionListener( buttonListener );
    button1.addActionListener( buttonListener );
    button2.addActionListener( buttonListener );
    button3.addActionListener( buttonListener );
    button4.addActionListener( buttonListener );
    button5.addActionListener( buttonListener );
    button6.addActionListener( buttonListener );
    button7.addActionListener( buttonListener );
    button8.addActionListener( buttonListener );
    button9.addActionListener( buttonListener );
    buttonPlus.addActionListener( buttonListener );
    buttonMinus.addActionListener( buttonListener );
    buttonTimes.addActionListener( buttonListener );
    buttonDivide.addActionListener( buttonListener );
    buttonClear.addActionListener( buttonListener );
    buttonEquals.addActionListener( buttonListener );

    

    JPanel pane = new JPanel();
    pane.setBorder(BorderFactory.createEmptyBorder( 30, 30, 10, 30 ));
    pane.setLayout(new GridLayout(5,5));
    pane.add(button0);
    pane.add(button1);
    pane.add(button2);
    pane.add(button3);
    pane.add(button4);
    pane.add(button5);
    pane.add(button6);
    pane.add(button7);
    pane.add(button8);
    pane.add(button9);
    pane.add(buttonPlus);
    pane.add(buttonMinus);
    pane.add(buttonTimes);
    pane.add(buttonDivide);
    pane.add(buttonEquals);
    pane.add(buttonClear);
    pane.add(label);
    return pane;
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("SwingApplication");
    Prob104 app = new Prob104();
    Component contents = app.createComponents();
    frame.getContentPane().add(contents, BorderLayout.CENTER);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);

  }
}
