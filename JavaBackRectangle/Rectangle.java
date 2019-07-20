package RectangleBasics;

public class Rectangle {
    private int height;
    private int width;
    
   public Rectangle () {
	   this.height = 5;
	   this.width = 5;
   }
   public Rectangle(int height, int width) {
	   this.height = height;
	   this.width = width;
   }
   public int setHeight(int height) {
	   this.height=height;
   }
   public int setWidth(int width) {
	   this.width =width;
   }
   public int getHeight() {
	   return this.height;
   }
   public int getWidth() {
	   return this.width;
   }
   public String toString() {
	   return "Height and Width are : "+this.height+" "+this.width;
   }
   public int getArea() {
	   return this.height*this.width;
   }
   public int getCircumferance() {
	   return 2*(this.height+this.width);
   }
}
