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
		B obj1 = new B();
		A obj2 = new B(); //restricting other methods of B except the interface declared methods
	  obj1.show();
	  obj1.display();
	  obj2.show();
	 // obj2.display(); //restricted
	
}
interface A {
	public void show() ;
}
class B implements A {
	public void show() {
		System.out.println("Hello....");
	}
	public void display() {
		System.out.println("Hi..");
	}
}
