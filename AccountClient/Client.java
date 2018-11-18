package ClientAccount;

public class Client {
	
	private int cId;
	private String name;
	private String address;
	private Account [] accountList;
	private int count;
	
	
	Client(){
		
	}
	Client(int cId, String name, String address){
		this.cId=cId;
		this.name=name;
		this.address=address;
		accountList = new Account [5];
		this.count=0;
	}
	
	void addAccount(Account acc) {
		accountList[count++]=acc;
	}
	
	String toString() {
		return "Client Information "+this.cId+" "+this.name+" "+this.address;
	}
	public StringBuilder toString1(){
		StringBuilder sb = new StringBuilder();
		sb.append(this.cId);
		sb.append(" ");
		sb.append(this.name);
		sb.append(" ");
		sb.append(this.address);
		sb.append("\n");
		for(int i=0; i<count; i++){
			sb.append(this.accountList[i].getANumber());
			sb.append(" ");
			sb.append(this.accountList[i].getBalance());
			sb.append(" ");
		}
		
		return sb;
	}
	
	
	

}
