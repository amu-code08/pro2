import java.util.*;

class Prob91 {
	private void processInput(String inString) {  
			String[] numbers = inString.split("\\s+");
			int result = 0;
			for (int i=0; i<numbers.length; i++) {
				if (numbers[i].compareTo("quit") == 0) {
					System.exit(0);
				} else if (numbers[i].compareTo("finish") == 0){
                    System.out.println(result);
                    result = 0;
                } else {
                    result += Integer.valueOf(numbers[i]);
                }
			}
	}

	public static void main(String[] args) {
		Prob91 app = new Prob91();
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.nextLine();
			app.processInput(str);
		}
	}
}

