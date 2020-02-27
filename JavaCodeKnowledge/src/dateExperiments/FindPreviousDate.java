package dateExperiments;

import java.util.Calendar;
import java.util.Date;

public class FindPreviousDate {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -7);
		Date projectCreatedDate = new Date(calendar.getTimeInMillis());
		System.out.println("projectCreatedDate " + projectCreatedDate);
		
		Calendar calendar_1 = Calendar.getInstance();
		System.out.println("today Date " + calendar_1.getTime());
		calendar_1.add(Calendar.DATE, +3);
		Date futureDate = new Date(calendar_1.getTimeInMillis());
		System.out.println("futureDate " + calendar_1.getTime());
	}

}
