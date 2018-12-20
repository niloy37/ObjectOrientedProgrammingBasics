
public class File extends Document{
	private String pathname;
	File(){
		
	}
	File(String text,String pathname){
		super(text);
		this.pathname=pathname;
	}
	public void setPathname(String pathname){
		this.pathname=pathname;
	}
	public String getPathname() {
		return this.pathname;
	}
	
	public String toString() {
		return "Text : "+super.toString()+" Path : "+this.pathname;
	}
	
}
