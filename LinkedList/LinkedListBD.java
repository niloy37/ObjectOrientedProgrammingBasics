package LinkedList;

public class LinkedListBD {
	//properties
	 Node head;
	int count;
	
	//constructors
	/*public LinkedList() {
		this.head=null;
		this.count=0;
	}
	*/
	public LinkedListBD(Node head) {
		this.head=head;
		this.count=1;
	}
	//methods
	
	//add
	public void addNode(int data) {
		Node temp = new Node(data);
		Node current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}
	//get
	
	
    public int getIndex(int index) {
    	if(index<0) {
    		return -1;
    	}
    	Node current = this.head;
    	for(int i=0;i<index;i++) {
    		current = current.getNext();
    	}
    	return current.getData();
    }
    //size 
    public int getSize() {
    	return this.count;
    }
    //isempty
    public boolean isEmpty() {
    	return this.head==null;
    }
    //remove a node 
    public void remove() {
    	Node current =this.head;
    	while(current.getNext().getNext()!= null) {
    		current = current.getNext();
    	}
    	current.setNext(null);
    	count--;
    	
    }

}
