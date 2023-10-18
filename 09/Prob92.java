import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
    
public class Prob92 {
    private static String countWordsandLetters(String s){
        int letters = s.length();
        String[] wordlist = s.split("\\s+");
        int words = wordlist.length;

        return letters + " " + words +": " ;
    }
    public static void main(String[] args){
        String inputFileName = "message.txt";
        String outputFileName = "output92.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(countWordsandLetters(line)+line+'\n'
                );
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
