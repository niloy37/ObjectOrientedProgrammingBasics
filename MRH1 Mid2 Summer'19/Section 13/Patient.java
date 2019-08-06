package mid22;

public class Patient {
private int patientId;
private String patientName;
private Appointment [] apts;
int appCounter;
Patient(int patientId, String patientName){
	this.patientId=patientId;
	this.patientName = patientName;
	apts = new Appointment[10];
	appCounter=0;
}


public void addAppointment(Appointment newAppointment) {
	if(newAppointment.getIsAvailable()) {
	apts[appCounter] = newAppointment;
	apts[appCounter].setIsAvailable(false);
	appCounter++;
	}
	else {
		System.out.println("Appointment Not Available");
	}
}

public void showAppointmentDetails(int index) {
	System.out.println(apts[index].toString());
}

public String toString() {
	return "Patient ID: "+this.patientId+" Patient Name: "+this.patientName;
}
}
