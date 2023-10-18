public class DialogTest { 
    public static void main(String[] args) { 
    String text = javax.swing.JOptionPane.showInputDialog(null); 

    String[] meat = new String[]{"beef", "pork"};
    String[] vegi = new String[]{"lettuce", "carrot"};
    String [] fruits = new String[]{"banana", "apple"};

    if(text.equals(meat[0])){
        System.out.println("meat");
    } else if(text.equals(meat[1])){
        System.out.println("meat");
    }  else if(text.equals(vegi[0])) {
        System.out.println("vegitable");
    } else if(text.equals(vegi[1])) {
        System.out.println("vegitable");  
    } else if(text.equals(fruits[0])) {
        System.out.println("fruits");
    } else if(text.equals(fruits[1])) {
        System.out.println("fruits");
    } else {
        System.out.println("unknown");
    }
    
    System.out.println(text); 
    } 
} 