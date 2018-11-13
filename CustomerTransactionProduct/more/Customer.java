package CustomerTransactionProduct;

public class Customer {
	
	private int id;
	private String name;
	private String address;
	private Product [] productList;
	
	Customer(int id,String name,String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	Customer() {
		
	}
	
	public void setProductArray(Product [] productList) {
		this.productList=productList;
	}
	
	public String toString() {
		return this.id+" "+this.name+" "+this.address;
	}
	public void CustomerProduct() {
		System.out.println("Customers Products");
		for(int i=0;i<5;i++) {
			System.out.println(productList[i].toString());
		}
	}
	
	
	
	

}
