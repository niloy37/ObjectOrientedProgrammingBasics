public class Rectangle extends GeometricObject{
	private double length;
	private double width;
	
	Rectangle(){
		
	}
	Rectangle(String color, boolean filled,double length,double width){
		super(color,filled);
		this.length=length;
		this.width=width;
	}
	public String toString() {
		return super.toString()+" "+this.length+" "+this.width;
	}
	public double getArea() {
		return length*width;
	}
}