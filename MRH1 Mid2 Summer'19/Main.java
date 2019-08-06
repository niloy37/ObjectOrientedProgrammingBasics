
public class Main {
public static void main (String [] args) {
	Club cec = new Club(1,"Computer Engineering Club",2001);
	Club ssc = new Club(2,"Social Service Club",2002);
	Activity cyber = new Activity(1,"Cybernauts","Pran Frooto");
	cec.addActivity(cyber);
	cec.showActivity(0);
	
	System.out.println("Total Number of Clubs: "+cec.getClubCount());

}

}
