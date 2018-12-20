
public class Document {
	
	protected String text;
	
	Document() {
		
	}
	Document(String text){
		this.text=text;
	}
	
	
	public void setText(String text) {
		this.text=text;
	}
	
	public String toString() {
		return this.text;
	}

}
