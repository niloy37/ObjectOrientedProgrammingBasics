package workcloneable;

public class Main {
public static void main(String [] args) {
	// TODO Auto-generated constructor stub
  try {
	  Date d1 = new Date("12 Jan,2018");
	House h1 = new House("Rok",d1);
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
//cloned
