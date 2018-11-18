package ClientAccount;

public class Account {
	
	
	private int accountNumber;
	private double accountBalance;

	
	
	Account (int accountNumber,double accountBalance){
		this.accountBalance=accountBalance;
		this.accountNumber=accountNumber;
		
		
	}
	Account() {
		
	}
	
	String toString() {
		return "Account Information" + this.accountBalance+" "+this.accountNumber;
	}
	
	 int getANumber() {
		 return accountNumber;
	 }
	 double getBalance() {
		 return accountBalance;
	 }
	
	
	
}
