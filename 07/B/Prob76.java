package B;
import java.util.ArrayList;
import java.util.Random;

public class Prob76 {

    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("No numbers!");
        } else if(Integer.valueOf(args[0]) == 0) {
            System.out.println("Not valid!");
        } else {
            int length = Integer.valueOf(args[0]);
            ArrayList<Integer> x = new ArrayList<Integer>();
            ArrayList<ArrayList<Integer>> y = new ArrayList<ArrayList<Integer>>();
            Random random = new Random();
            
            for(int i = 0; i<length; i++){
                x.add(random.nextInt(9));
            }
    
            for(int i = 0; i< x.size()-1; i+=2){
                ArrayList<Integer> pair = new ArrayList<Integer>();
                pair.add(x.get(i));
                pair.add(x.get(i+1));
                y.add(pair);
            }
    
            int counter = 0;
            while (counter<y.size()) {
                ArrayList<Integer> element = y.get(counter);
                counter++;
                if(element.get(0)<element.get(1)){
                    y.remove(element);
                    counter--;
                }
            }
           
            for (Integer sub: x){
                System.out.print(sub);
            }
            System.out.println();
    
            for (ArrayList<Integer> s: y){
                System.out.print(s.get(0));
                System.out.print(s.get(1));
            }
        }
        
    }
}
