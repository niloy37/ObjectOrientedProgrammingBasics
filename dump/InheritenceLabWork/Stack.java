package InheritenceLabWork;
import java.util.*;
public class Stack {

	private int [] arr;
	private int top;
	private int size;
	
	
	Stack () {
		
	}
	Stack(int size){
		this.size=size;
		arr= new int[this.size];
	}
	Stack() {
		this.arr = new int [5];
		this.top=-1;
	}
	
	public void push(int value) {
		if(this.top<this.size)
		this.arr[this.top++]=value;
		else System.out.println("Stack Overflow");
	}
	public int pop() {
		if(top<0)
		
		 System.out.println("Stack Underflow");
		else 
			return this.arr[--this.top];
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<this.top;i++) {
			sb.append(arr[i]);
			sb.append(" ");
			
		}
		return sb.toString();
	}
	
}
