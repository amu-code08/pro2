import java.util.*;

class Adder {
	private void processInput(String inString) {  
		String[] inputs = inString.split("\\sfinish");
		for(String input : inputs){
			String[] numbers = input.split("\\s+");
			int result = 0;
			for (int i=0; i<numbers.length; i++) {
				if (numbers[i].compareTo("quit") == 0) {
					System.exit(0);
				}
				result += Integer.valueOf(numbers[i]);
			}
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		Adder app = new Adder();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Please input numbers: ");
			String str = scan.nextLine();
			app.processInput(str);
		}
	}
}

