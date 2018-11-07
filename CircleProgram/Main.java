package CircleObject;

public class Main extends Circle{
	public static void main(String[] args) {
		
		//initializing circle object with radius
		Circle c1 = new Circle(5);
		Circle c2 = new Circle();
		
		// Setter 
		c2.setRadius(3);
		//Calling methods  (Objectname.Methodname(parameter);)
		System.out.print("Circle 1 details");
		c1.circleArea();
		
		c1.circleCircumference();
		System.out.println("Circle 2 Details -");
		c2.circleArea();
		
		c2.circleCircumference();
		
		//changing radius of circle 1 now
		c1.setRadius(3); //same as circle 2
		//printing new details
		System.out.println("New Circle one");
		c1.circleArea();
		c1.circleCircumference();
		
		
		
		
		
		
	}

}
