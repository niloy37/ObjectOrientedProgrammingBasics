package CustomerTransactionProduct;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Product p1 = new Product(12,"Juice",10.05);
		Customer c1 = new Customer(03,"Euclid","143 home Street 3");
		
		Customer [] arrayCustomer = new Customer [5];
		Product []  arrayProduct = new Product [5];
		Scanner var = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter Product Id ");
			int x = var.nextInt();
			System.out.println("Enter Product name");
			String s = input.nextLine();
			System.out.println("Enter Price ");
			double y = var.nextDouble();
			
			arrayProduct[i]=new Product(x,s,y);
			
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter Customer ID");
			int z=var.nextInt();
			System.out.println("Enter Customer Name");
			String q = input.nextLine();
			System.out.println("Enter Customer Address");
			String p = input.nextLine();
			arrayCustomer[i]= new Customer(z,q,p);
		}
		
		
		p1.setCustomerList(arrayCustomer);
		c1.setProductArray(arrayProduct);
		
		
		p1.productCustomer();
		c1.CustomerProduct();
		
	}

}
