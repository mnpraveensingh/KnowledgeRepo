package basicCodes;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DiffInTwoDatesInDays {

	public static void main(String[] args) {
		// Get Difference Between 2 Dates in Days
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(2019, Month.DECEMBER, 19);
		long period = ChronoUnit.DAYS.between(birthday, today); // today - birthday = +value and birthday - today = -value
		System.out.println(period);

		// Get Past Date Based on number of Days
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -10);
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		Date pastDate = new Date(cal.getTimeInMillis());
		System.out.println("10 days before date : "+pastDate);

		// Get future Date Based on number of Days
		Calendar cal_1 = Calendar.getInstance();
		cal_1.add(Calendar.DATE, 10);
		Date futureDate = new Date(cal_1.getTimeInMillis());
		System.out.println("10 days after date : "+futureDate);

		Calendar calendar = Calendar.getInstance();
		System.out.println("current date: " + calendar.getTime());
		calendar.add(Calendar.DATE, 7);
		System.out.println("7 days later: " + calendar.getTime());
		
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateBeforeString = "31/01/2014";
		String dateAfterString = "02/02/2014";
		try {
		       Date dateBefore = new Date();
		       Date dateAfter = myFormat.parse(dateAfterString);
		       long difference = dateAfter.getTime() - dateBefore.getTime();
		       float daysBetween = (difference / (1000*60*60*24));
		       System.out.println("Number of Days between dates: "+daysBetween);
		 } catch (Exception e) {
		       e.printStackTrace();
		 }
		// to get the list of months
		String[] months = new DateFormatSymbols().getMonths(); // will return 13 size array last index is empty
		List<String> monthsList = new ArrayList<String>();
		for (String month : months) {
			if (month != null && !month.trim().isEmpty()) {
				monthsList.add(month);
			}
		}
	}

}
