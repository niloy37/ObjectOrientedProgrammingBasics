package Employee;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	
	Employee e1 = new Employee(101,10000,"Nixon","Mendela");
	Employee e2 = new Employee();
	
	e2.setFirstname("Abul ");
	e2.setLastname("Kashim");
	e2.setId(102);
	e2.setSalary(15000);
	
	
	System.out.println("New Salary after raise for Abul Kashim "+e2.raiseSalary(15));
	
	System.out.println(e1.toString());
	System.out.println(e2.toString());
	
}
}
