package Circles;

public class Main {
	public static void main(String[] args) {
		Circle [] circles = new Circle[10];
		
		
		for(int i=0;i<10;i++) {
			circles[i]=new Circle(i*2);
		}
		
		
		for(int i=0;i<10;i++) {
			circles[i].showRadius();
			circles[i].showArea();
		}
	}

}
