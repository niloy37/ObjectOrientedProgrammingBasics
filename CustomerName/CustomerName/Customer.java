package CustomerName;

public class Customer  {
	
	
	
	private int id;
	private int age;
	private Name name;
	
	
	Customer(int id,int age,Name name){
		this.id=id;
		this.age=age;
		this.name=name;
		
	}
	Customer(){
		
	}
	
	public String toString() {
		return this.id+" "+this.age+" "+" "+this.name.toString();
	}

}
