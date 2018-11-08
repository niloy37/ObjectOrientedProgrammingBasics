package Triangle;
import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	
	
	System.out.println("Enter Triangle 1 base and height");
	int length1 = var.nextInt();
	int breadth1 = var.nextInt();
	
	Triangle t1 = new Triangle(length1,breadth1);
      
	
	Triangle t2 = new Triangle();
	
	
     System.out.println("Enter triangle 2 base and height");
     int length2=var.nextInt();
     int breadth2 = var.nextInt();
     
     
     t2.setBase(breadth2);
     t2.setHeight(length2);
     
     
     
     System.out.println("Area of triangle 1 = "+t1.area());
     System.out.println("Area of triangle 2 = "+t2.area());
	
	
}
}
