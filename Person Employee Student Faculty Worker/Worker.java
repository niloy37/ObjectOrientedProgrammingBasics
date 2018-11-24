package PersonEmployeeFacultyStudent;

public class Worker extends Employee {
	
	private String workerType;
	
	
	
	Worker(){
		
	}
	Worker(int id,String name,double salary,String workerType){
		super(id,name,salary);
		this.workerType=workerType;
	}
	public String toString() {
		return super.toString()+" "+this.workerType;
	}

}
