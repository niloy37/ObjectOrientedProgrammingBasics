package PersonEmployeeFacultyStudent;

public class Employee extends Person {
protected double salary;
	
	
	Employee() {
		super();
		
		
	}
	
	Employee(int id,String name,double salary){
		super(id,name);
		this.salary=salary;
	}
	
	public String toString() {
		return super.toString()+" "+this.salary;
	}

}



