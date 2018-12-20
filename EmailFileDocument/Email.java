
public class Email extends Document{
  private String sender;
  private String recipient;
  private String title;
  public Email(){
	  
  }
  public Email(String text,String sender,String recipient,String title) {
	  super(text);
	  this.sender=sender;
	  this.recipient=recipient;
	  this.title=title;
  }
  
  public String toString() {
	  return "Sender : "+this.sender +" Recipient : "+this.recipient+" Title: "+this.title+" Text : "+super.toString();
  }
  
  public void setSender(String sender) {
	  this.sender=sender;
  }
 public void setRecipient(String recipient) {
	  this.recipient=recipient;
  }
 public void setTitle(String title) {
	  this.title=title;
 }
 
 public String getSender() {
	 return this.sender;
 }
public String getRecipient() {
	 return this.recipient;
 }
public String getTitle() {
	 return this.title;
}
}
