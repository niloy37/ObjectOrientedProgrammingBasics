package Inheritence;

public class Main {
	
	public static void main(String [] args) {
		
		Person p1 = new Person(101,"Alice");
		Employee e1 = new Employee(102,"Becker",50000.00);
		Student s1 = new Student (103,"John",122);
		
		System.out.println(p1.toString());
		System.out.println(e1.toString());
		System.out.println(s1.toString());
		
		p1=new Student(101,"Alice is now a Student",80);
		System.out.println(p1.toString());
		
		
	}

}
