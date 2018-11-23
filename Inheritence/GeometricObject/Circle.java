public class Circle extends GeometricObject{
	private double radius;
	
	Circle(){
		
	}
	Circle(String color,boolean filled,double radius){
		super(color,filled);
		this.radius=radius;
		
	}
	public String toString() {
		return super.toString()+" "+this.radius;
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
}