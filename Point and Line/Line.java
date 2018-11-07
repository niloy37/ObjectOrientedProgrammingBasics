package Line;
import java.lang.*;
import java.util.*;



public class Line extends Point {
	
	Point start = new Point();
	Point end = new Point();
	
	Line(int x1,int y1 , int x2,int y2){
		start = new Point(x1,y1);
		end = new Point (x2,y2);
		
	}
	
	
	Line(Point Start,Point End){
		
		
		start=Start;
		end = End;
		
		
	}
	
	void setStart(Point Start) {
		start = Start;
		
		
	}
	  void setEnd(Point End) {
		  end = End;
	  }
	  
		Point getStart() {
			return start;
		}
		Point getEnd() {
			return end;
		}
		double length() {
			double x1=start.getX();
			double y1=start.getY();
			double x2=end.getX();
			double y2 = end.getY();
			return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		}
		
	
	
	

}
