package CustomerTransactionProduct;

public class Product {

	private int id;
	private String name;
	private double price;
	private Customer [] customerList;
	
	Product(int id,String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
		this.customerList=customerList;
	}
	Product() {
		
	}
	public void setCustomerList(Customer [] customerList) {
		this.customerList=customerList;
	}
	
	public void productCustomer() {
		System.out.println("Customer for Product id "+this.id);
		for(int i=0;i<5;i++) {
			System.out.println(customerList[i].toString());
		}
	}
	
	public String toString() {
		return this.id+" "+this.name+" "+this.price;
	}
	
}
