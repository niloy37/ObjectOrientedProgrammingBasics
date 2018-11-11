package Person;
import java.util.*;

public class Person {
	
	private int id;
	private String name;
	private double height;
	private double weight;
	private String nationality;
	private static int count;
	
	Person(){
		count++;
	}
	Person(int id,String name,String nationality,double height,double weight){
		this.id=id;
		this.name=name;
		this.nationality=nationality;
		this.height =height;
		this.weight=weight;
				
		
		count++;
	}
	
	public String toString() {
		return "Person details = "+this.id+" "+this.name+" "+this.nationality+" "+this.height+" "+this.weight;
	}
	
	public double calculateBMI() {
		return weight/Math.pow(height, 2);
	}
	public boolean compareTo(Person P) {
		return (this.calculateBMI()>P.calculateBMI())?true:false;
	}
	
	public static int showCount() {
		return count;
	}
	
	

}
