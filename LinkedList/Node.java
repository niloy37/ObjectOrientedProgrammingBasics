package LinkedList;

public class Node {
	//properties
	private Node next;
	private int data ;
	
	//constructors
	public Node(int data, Node next){
		this.data =data;
		this.next = next;
	}
	
	public Node(int data) {
		this.data=data;
	}
	//methods!
	public Node getNext() {
		return this.next;
	}
	public int getData() {
		return this.data;
	}
	public void setData(int data) {
		this.data= data;
	}
	public void setNext(Node next) {
		this.next=next;
	}

}
