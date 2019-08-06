
public class Club {
private int clubId;
private int yearEstablished;
private String clubName;
private static int count=0;
private Activity [] avt;
private int ca;

Club(){
	count++;
	avt = new Activity[5];
	ca=0;
}
Club(int clubId,String clubName,int yearEstablished){
	this.clubId = clubId;
	this.clubName = clubName;
	this.yearEstablished = yearEstablished;
	count++;
	avt = new Activity[5];
	ca=0;
}

public void addActivity(Activity a) {
	avt[ca] = a;
	ca++;
}
//to check avtivity details
public void showActivity(int index) {
	System.out.println(avt[index].toString());
}
public static int getClubCount() {
	return count;
}

}
