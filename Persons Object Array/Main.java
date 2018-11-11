package Person;
import java.util.*;


public class Main {
	
	
	public static void main(String[] args) {
		
	
	Person p1 = new Person(101,"Niloy","Bangladeshi",1.6,60.0);
	Person p2= new Person(102,"Tamanna","Bangladeshi",1.5,50.0);
	
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	System.out.println(p1.calculateBMI());
	System.out.println(p2.calculateBMI());
	
	System.out.println(p1.compareTo(p2));
	
	Person [] persons = new Person [10];
	
	
	for(int i=0;i<10;i++) {
		persons[i] = new Person(i*5,"Anonymous","Anonymous",1.5+Math.random()*0.4,40+Math.random()*60);
	}
	for(int i=0;i<10;i++) {
		System.out.println(persons[i].toString());
	}
	
	System.out.println("Number of Persons Created "+ Person.showCount());
	
  System.out.println(persons[0].compareTo(persons[9]));	
	

	}
}
