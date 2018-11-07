package rectangleSquare;

public class Main {
public static void main(String[] args) {
	Input one = new Input(5,6);
	Rectangle first = new Rectangle(one);
	
	System.out.println(first.area());
	System.out.println(first.perimeter());
	
	
}
}
