package workcloneable;

public class Main {
public static void main(String [] args) {
	// TODO Auto-generated constructor stub
  try {
	House h1 = new House("Rok");
   House h2=h1;
   House h3 = (House)h1.clone();
   System.out.println(h1==h2);
   System.out.println(h3==h1);
   System.out.println(h3.toString());
  }catch(Exception e) {
	  System.out.println(e);
  }
  
	}
}
