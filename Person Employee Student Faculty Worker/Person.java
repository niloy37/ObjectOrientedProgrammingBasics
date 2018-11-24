package PersonEmployeeFacultyStudent;

public class Person {
	protected int id;
	protected String name;
	
	Person() {
		
	}
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	
	public String toString () {
		return this.id+" "+this.name;
	}


}
