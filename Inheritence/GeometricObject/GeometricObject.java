import java.util.*;
public class GeometricObject {
	protected String color;
	protected boolean filled;
	
	GeometricObject(){
	}
	GeometricObject(String color,boolean filled){
		this.color=color;
		this.filled=filled;
	}
	public String toString() {
		return this.color+" "+this.filled;
	}
	public double getArea() {
		return 0.0;
	}
		
}