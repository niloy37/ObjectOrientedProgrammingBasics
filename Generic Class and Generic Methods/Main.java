package workspace1;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
public static void main (String [] args) throws java.lang.Error{
	
	GenericList<Integer> g = new GenericList<Integer>();
	
	g.push(15);
	g.push(10);
	
	System.out.println(g.peek());
	System.out.println(g.pop());
	System.out.println(g.peek());
	int x=max(100.5,100.5);
	if(x==1) {
		System.out.println("Greater");
	}
	else if(x==0) {
		System.out.println("Equals");
	}
	else System.out.println("Smaller");
	
	
}

public static <E extends Comparable<E>> int max (E a, E b) {
	
	return a.compareTo(b);
	
}

}
