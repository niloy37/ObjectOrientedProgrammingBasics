package Line;

public class Main{
public static void main(String[] args) {
	Point p1 = new Point(1,4);
	Point p2 = new Point(5,7);
	
	Line l1 = new Line(p1,p2);
	Line l2 = new Line (1,2,3,4);
	System.out.println(l1.length());
	System.out.println(l2.length());
}
}
