package PersonEmployeeFacultyStudent;

public class Main {
	public static void main (String [] args) {
		
		
		Person p1 = new Person(1,"Person 1/Only Person");
		Employee e1 = new Employee(2,"Employee 1/is a Person",12000.00);
		Student s1 = new Student(3,"Student 1/is a Person",133);
		Faculty f1 = new Faculty(4,"faculty 1/is a Employee",37000.50,5);
		Worker w1 = new Worker(5,"Worker 1/is a Employee",6000.00,"Cleaner");
		Worker w2= new Worker(6,"Worker 2/is a Employee",7000.00,"Security");
		System.out.println(p1.toString());
		System.out.println(e1.toString());
		System.out.println(s1.toString());
		System.out.println(f1.toString());
		System.out.println(w1.toString());
		System.out.println(w2.toString());
		
		
		
	}

}
