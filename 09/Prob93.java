import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
    
public class Prob93 {
    static int totalLines = 0;
    static int totalWords = 0;
    private static void countWordsandLines(String inputFileName){
        int words = 0;
        int lines = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(inputFileName))){
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                words += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println(lines + " " + words + " " + inputFileName);
            totalLines += lines;
            totalWords += words;
        }
    }
    
    public static void main(String[] args){
        for(int i = 0; i < args.length; i++){
            countWordsandLines(args[i]);
        }
        System.out.println(totalLines + " " + totalWords + " total");
    }
}
