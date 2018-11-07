package Line;
import java.lang.*;
import java.util.*;
import java.io.*;



public class Point {
	
	private int x;
	private int y;
	Point(){
		
	}
	
	Point(int X,int Y){
		x=X;
		y=Y;
		
	}
	
	void setX(int X) {
		x=X;
	}
	void setY(int Y) {
		y=Y;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	
	
	
	double distance(Point p) {
		return Math.sqrt(Math.pow(x-p.x,2)+Math.pow((x-p.y, b),2));
	}
	

}
