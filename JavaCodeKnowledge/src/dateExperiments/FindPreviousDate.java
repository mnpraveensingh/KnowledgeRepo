package dateExperiments;

import java.util.Calendar;
import java.util.Date;

public class FindPreviousDate {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -7);
		Date projectCreatedDate = new Date(calendar.getTimeInMillis());
		System.out.println("projectCreatedDate " + projectCreatedDate);
	}

}
