package workcloneable;

public class House implements Cloneable{
	
	private String s;
	private Date d1;
	House(String s,Date d1){
		this.s=s;
		this.d1=d1;
	}

	
	public String toString() {
		return this.s+" "+this.d1.toString();
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		House houseClone = (House)super.clone();
		try {
		houseClone.d1 = (Date) (d1.clone());
		}catch(CloneNotSupportedException e) {
			System.out.println(e);
		}
		return houseClone;
	}
}
