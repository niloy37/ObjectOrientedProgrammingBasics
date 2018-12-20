package workspace1;
import java.util.*;
import java.lang.*;
import java.io.*;

public class GenericList<E> {

	ArrayList<E> array = new ArrayList<E>();
	
	
	GenericList(){
		
	}
	
	public void push(E a) {
		array.add(a);
	}
	
	
	public E pop() {
		int top = array.size()-1;
		E value = array.get(top);
		array.remove(top);
		
		return value;
	}
	
	
	public E peek() {
	  int top = array.size()-1;
	  return array.get(top);
	}
	
	
	
	
}
