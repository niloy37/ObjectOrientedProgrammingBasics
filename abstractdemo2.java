package morejava;

 class AbstractClass {
	public static void main (String [] args) {
	Phone p1 = new newPhone();	
	p1.call();
	p1.turnoff();
	}

}
 abstract class Phone {
	 public void call(){
		 System.out.println("Calling....");
		 
	 }
	 public abstract void turnoff();
 }
 class newPhone extends Phone{
	 public void turnoff() {
		 System.out.println("Turning off....");
	 }
	 
 }
//tzz
