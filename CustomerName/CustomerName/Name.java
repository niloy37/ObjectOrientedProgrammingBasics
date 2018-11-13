package CustomerName;

public class Name {
	
	private String first;
	private String middle;
	private String last;
	
	
	
	Name(String first,String middle,String last){
		this.first=first;
		this.middle=middle;
		this.last=last;
	}
	Name() {
		
	}
	public String toString() {
		return this.first+" "+this.middle+" "+this.last;
	}

}
