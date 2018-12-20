
public class Main {

	
		public static void main(String [] args) {
			Document e = new Email("Hello World","Rick","Morty","Hello World");
			Document f = new File("Hello World","HelloWorld.txt");
			System.out.println(e.toString());
			System.out.println(f.toString());
		}
}
