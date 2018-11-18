package ClientAccount;

import java.io.*;
import java.lang.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner var = new Scanner(System.in);
		Account a1 = new Account (2001, 123.45);
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Account Info: ");
		int an = input.nextInt();
		double b = input.nextDouble();
		Account a2 = new Account(an, b);
		System.out.println("Enter Client Info: ");
		int id = input.nextInt();
		
		String name = var.nextLine();
	
		String addr  = var.nextLine();
		Client c1 = new Client (id, name, addr);
		
		// before adding any account to c1
		System.out.println(c1.toString1());
		
		c1.addAccount(a1);
		c1.addAccount(a2);
		
		// after adding accounts

		System.out.println(c1.toString1());
		
		
		
	}
}
