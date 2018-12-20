package workcloneable;

public class House implements Cloneable{
	
	private String s;
	House(String s){
		this.s=s;
	}

	
	public String toString() {
		return this.s;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
