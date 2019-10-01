/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Phone p1 = new thirdPhone();
		p1.call();
		p1.receive();
		p1.sendMessage();
		p1.turnOff();
	}
}

abstract class Phone {  //abstract class
	public void call() {
		System.out.println("Calling....");
		
	}
	public abstract void receive();
	public abstract void sendMessage();
	public abstract void turnOff();
}

abstract class secondPhone extends Phone {
	//abstract class
	public void receive(){
		System.out.println("Receiving....");
	}
}
class thirdPhone extends secondPhone {
	//concrete class 
	public void sendMessage(){
		System.out.println("Sending Message...");
	}
	public void turnOff(){
		System.out.println("Turning off the phone");
	}
}//abstract
