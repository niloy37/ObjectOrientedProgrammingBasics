package PersonEmployeeFacultyStudent;

public class Faculty extends Employee {
	
	private int workdays;
	
	Faculty(){
		
	}
	Faculty(int id,String name,double salary,int workdays) {
	 super(id,name,salary);
	 this.workdays=workdays;
		
	}
	public String toString() {
		return super.toString()+" "+this.workdays;
	}

}
