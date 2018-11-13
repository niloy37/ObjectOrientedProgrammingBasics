package CustomerName;

public class Main {
	public static void main(String[] args) {
		
		Name name = new Name("John","F","Kennedy");
		Customer customer = new Customer(01,25,name);
		
		
		System.out.println(customer.toString());
	}

}
