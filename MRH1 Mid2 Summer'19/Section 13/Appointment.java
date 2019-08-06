package mid22;

public class Appointment {
	

	
	private int appointmentId;
	private String date;
	private int slotId;
	private boolean isAvailable;

	public Appointment(int appointmentId, String date , int slotId) {
		this.appointmentId = appointmentId;
		this.date = date;
		this.slotId = slotId;
		isAvailable = true;
	}
	
	public String toString() {
		return "Appointment Id: "+this.appointmentId+" Appointment Date: "+this.date+" Appointment Slot"+this.slotId;
	}
	public void setIsAvailable(boolean f) {
		this.isAvailable = f;
	}
	public boolean getIsAvailable() {
		return this.isAvailable;
	}

}
