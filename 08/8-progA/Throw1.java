public class Throw1 {

	public static void methodA(String fruit) throws Exception {
		if (fruit.equals("banana"))
			throw new Exception("BANANA!");
		System.out.println("Fruit = " + fruit);
	}

	public static void main(String[] args) throws Exception {
		methodA("apple");
		System.out.println("Let's eat!");
		methodA("banana");
		System.out.println("The end");
	}
}
