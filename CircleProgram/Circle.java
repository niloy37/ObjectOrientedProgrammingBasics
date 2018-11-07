package CircleObject;
import java.util.*;

public class Circle {
	
	private int radius;
	
	void circleArea () {
		double area = 2*Math.PI*(radius*1.0); 
		System.out.println("Area is "+area);
	}
	
	void circleCircumference() {
		double circumference = Math.PI*(radius*radius*1.0);
		
		System.out.println("Circumference is  "+circumference);
		
	}
	
	Circle(int r){
	radius=r;
	}
	Circle(){
		radius =0;
	}
	void setRadius(int r) {
		radius = r;
	}
	
		
	

}
