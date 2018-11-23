import java.util.*;
public class Main{
	public static void main(String [] args) {
		GeometricObject o1=new GeometricObject("Red",true);
		GeometricObject o2=new GeometricObject("Green",false);
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		
		Circle c1=new Circle("Blue", false,3.00);
		System.out.println(c1.toString());
		System.out.println("Area: "+c1.getArea());
		
		Rectangle r1=new Rectangle("Yellow", true,6.00,8.05);
		System.out.println(r1.toString());
		System.out.println("Area: "+r1.getArea());
				
	}

}