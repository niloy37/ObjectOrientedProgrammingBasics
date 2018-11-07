package rectangleSquare;

public class Rectangle extends Input {

	
	 private int x ;
	 private int y ;
	 Rectangle() {
		 
	 }
	 Rectangle(Input one){
		x=one.getX();
		 y=one.getY();
		 
	 }
	 
	 
	 int area() {
		 
		 return x*y;
	 }
	 int perimeter() {
      int peri =x+x+y+y;
		 return peri;
		 
		 
	
	 }

}
