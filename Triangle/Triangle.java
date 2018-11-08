package Triangle;
import java.util.*;
public class Triangle {
	
	
	
	private int base;
	private int height;
	
	Triangle (int base , int height){
		this.base = base;
		this.height =height;
	}
	Triangle(){
		
	}
	
	public void setBase(int base) {
		this.base =base;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public int getHeight() {
		return height;
	}
	public int getBase() {
		return base;
	}
	
	public  double area() {
		double area = 0.5*base*height;
		area = Math.round(area*100d)/100d;
		return area;
		
	}
	

}
