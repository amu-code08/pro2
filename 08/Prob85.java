import java.util.ArrayList;
public class Prob85 {
    public static void main(String[] args){
        String str = "";
        for (String s : args){
            str += s;
        }
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : str.toCharArray()) {
            if(Character.isLetter(c)){
                chars.add(Character.toLowerCase(c));
            } else {
                System.out.println("Incorrect input!");
                return;
            }
        }

        int size = chars.size();

        for(int i = 0; i<size/2; i++){
            if(!chars.get(i).equals(chars.get(size-i-1))){
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }


}
