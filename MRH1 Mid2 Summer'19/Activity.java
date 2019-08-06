
public class Activity {
private int activityId;
private String activityName;
private String activitySponser;

public Activity(int activityId,String activityName,String activitySponser) {
this.activityId = activityId;
this.activityName = activityName;
this.activitySponser = activitySponser;
}


public String toString() {
	return "Activity ID: "+this.activityId+" Activity Name: "+this.activityName+" Activity Sponser: "+this.activitySponser;
}



}
