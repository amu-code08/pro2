public class CharSetUser {

	public static void main(String[] args) {
		CharSet s = new CharSet();
		s.init();
		System.out.println("count = " + s.count());
		s.add('k'); s.add('e'); s.add('i'); s.add('o');
		System.out.println("k: " + s.search('k'));
		System.out.println("e: " + s.search('e'));
		System.out.println("i: " + s.search('i'));
		System.out.println("o: " + s.search('o'));
		System.out.println("count = " + s.count());
		s.remove('i');
		System.out.println("k: " + s.search('k'));
		System.out.println("e: " + s.search('e'));
		System.out.println("i: " + s.search('i'));
		System.out.println("o: " + s.search('o'));
		System.out.println("count = " + s.count());
		s.add('a');
		s.add('x');
		s.add('k');
		System.out.println("k: " + s.search('k'));
		System.out.println("e: " + s.search('e'));
		System.out.println("i: " + s.search('i'));
		System.out.println("o: " + s.search('o'));
		System.out.println("a: " + s.search('a'));
		System.out.println("x: " + s.search('x'));
		System.out.println("count = " + s.count());
	}
}
