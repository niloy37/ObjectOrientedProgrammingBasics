package workcloneable;

public class Date implements Cloneable{
	
	private String date;
	Date(String date){
		this.date=date;
	}
	
	public String toString() {
		return this.date;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
