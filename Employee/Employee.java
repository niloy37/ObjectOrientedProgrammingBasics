package Employee;

public class Employee {
	
	private int id;
	private int salary;
	private String firstname;
	private String lastname;
	
	Employee(int id , int salary , String firstname, String lastname){
		this.id=id;
		this.salary=salary;
		this.firstname=firstname;
		this.lastname=lastname;
		
	}
	
	Employee(){
		
	}
	
	
	public String toString() {
		return id+" "+firstname+" "+lastname+" "+salary;
	}
	
	public void setId(int id){
		this.id=id;
		
	}
	public void setSalary(int salary) {
		this.salary=salary;
		
	}
	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}
	public void setLastname(String lastname) {
		this.lastname=lastname;
	}
	
	public int getId() {
		return id;
	}
	public int getSalary(){
		return salary;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getAnnualSalary() {
		return salary*12;
	}
	public double raiseSalary(int percent) {
		double newSalary =(double)salary+((salary*1.0)*(percent*1.0/100));
		return newSalary;
	}

}
