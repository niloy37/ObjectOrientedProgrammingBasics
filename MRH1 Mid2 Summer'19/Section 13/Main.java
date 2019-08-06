package mid22;

public class Main {
public static void main(String[] args) {
	Appointment a1 = new Appointment(1,"5-7-19",1);
	Appointment a2 = new Appointment(1,"5-7-19",2);
	
	Patient p1= new Patient(1,"Iftekher Mugdho");
	Patient p2 = new Patient(2,"Mug");
	
	p1.addAppointment(a1);
	p1.addAppointment(a2);
	p1.showAppointmentDetails(0);
	p1.showAppointmentDetails(1);
	//adding a appointment that is already to added to a patient
	p2.addAppointment(a1); //error will be shown
	
	
}
}
