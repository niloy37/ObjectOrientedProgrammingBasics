package Line;
import java.lang.*;
import java.util.*;
import java.io.*;



public class Point {
	
	private int x;
	private int y;
	Point(){
		
	}
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	
	void setX(int x) {
		this.x=x;
	}
	void setY(int y) {
		this.y=y;
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
