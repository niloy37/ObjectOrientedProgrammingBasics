package Inheritence;

public class Student extends Person {
	
	private int creditCount;
	
	
	Student() {
		super();
	}
	Student(int id,String name,int creditCount){
		super(id,name);
		this.creditCount=creditCount;
		
	}
	
	public String toString() {
		return super.toString()+" "+this.creditCount;
	}
	

}
