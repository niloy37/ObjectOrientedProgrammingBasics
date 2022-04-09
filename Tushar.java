
import java.util.*;
import java.io.*;

 class NotEnoughBalance extends Exception {
 	NoghtEnoughBalance(String s);
 	super(s);
 }

 class InvalidAmount extends Exception {
 	InvalidAmount(String s);
 	super(s);
 }

 class InvalidTitle extends Exception {
 	InvalidTitle(String s);
 	super(s);
 }


 class Account {
	 private int accountNo;
	 private double accountBalance;
	 private  String accountTitle;


	 //methods
	 void Deposit(double x) {
		 accountBalance+=x;
	 }
	 void Withdraw(double x) throws NotEnoughBalance {
		 if(accountbalance < x)
		 throw new NotEnoughBalance("Not Enough balance")
		 else
		 accountBalance-=x;
	 }
	 //setters
	 void setAccountTitle(String s) throws InvalidTitle {
		 if(s == '\0')
		 throw new InvalidTitle("Invalid Title / Title cannot be null");
		 accountTitle = s;
	 }
	 void setAccountNo(int x) {
		 accountNo=x;

	 }
	 void setAccountBalance(double x) throw InvalidAmount {

	 	if(x < 0)
	 	throw new InvalidAmount("Cannot set it to less than zero");
		else
		accountBalance = x;
	 }
	 //printer
	 void show() {
		 System.out.println(accountTitle);
		 System.out.println(accountNo);
		 System.out.println(accountBalance);
	 }

	 //constructor (developer cannot call it auto executed when making object);
	 Account(int x,double y,String s){
		 System.out.println("Inside Constructor with parameter");
		 accountNo =x;
		 accountBalance = y;
		 accountTitle = s;
	 }

	 //to prevent method overloading
	 Account(){
		 System.out.println("Inside Constructor without parameter");
		 accountNo = 0;
		 accountBalance = 0.0;
		 accountTitle=null;
	 }



}


 class Main{

	 public static void main(String[] args) {
		 Scanner var = new Scanner(System.in);
		 Account acc1 = new Account(181600642,15000.50,"Bob Lift");
		 Account acc2 = new Account();

		 acc2.setAccountNo(181622642);
		 acc2.setAccountTitle("Trace McGrady");
		 acc2.setAccountBalance(13000.30);

		 acc1.show();
		 acc2.show();

		 System.out.println("Press 1 to handle Account 1 and 2 for Account 2");
		 int x = var.nextInt();
		 System.out.println("Enter Option 1 for withdraw and 2 for Deposit");
		 int y = var.nextInt();
		 System.out.println("Enter amount");
		 double amount = var.nextDouble();
		 if(x==1) {
			 if(y==1) {

				try{
				 acc1.Withdraw(amount);
				} catch (NotEnoughBalance e){
					System.out.println("Not enough Balance");
				}

			 }
			 else acc1.Deposit(amount);
			 acc1.show();
		 }
		 else if(x==2) {
			 if(y==1) {
				 acc2.Withdraw(amount);
			 }
			 else acc2.Deposit(amount);
			 acc2.show();
		 }


	}
 }
