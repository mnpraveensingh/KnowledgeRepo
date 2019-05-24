package code.experiment;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FindAge {

	public static void main(String[] args) {
		Calendar birthDay = new GregorianCalendar(2015, Calendar.AUGUST, 15);
		Calendar today = new GregorianCalendar();
		today.setTime(new Date());
		int yearsInBetween = today.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
		int monthsDiff = today.get(Calendar.MONTH) - birthDay.get(Calendar.MONTH);
		long ageInMonths = yearsInBetween * 12 + monthsDiff;
		long age = yearsInBetween;
		System.out.println("Number of months since James gosling born : " + ageInMonths);
		System.out.println("Sir James Gosling's age : " + age);
	}

}
