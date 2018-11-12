package Circles;
import java.util.*;
public class Circle {
	 private int radius;
	 
	 
	public void showRadius() {
		System.out.println(radius);
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public void showArea() {
		System.out.println(Math.PI*this.radius*this.radius);
	}
	Circle() {
		
	}
	Circle(int radius){
		this.radius=radius;
	}

}
