package dateExperiments;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Random;

public class LastDateOfMonth {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int res = cal.getActualMaximum(Calendar.DATE);
		System.out.println("Today's Date = " + cal.getTime());
		System.out.println("Last Date of the current month = " + res);
		cal.set(Calendar.DAY_OF_MONTH, res);
		System.out.println("last date Date = " + cal.getTime());

		LocalDate localDate = cal.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("localDate : " + localDate);

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat formatter_1 = new SimpleDateFormat("dd-MM-yyyy hh:mm a");
		String strDate = formatter.format(cal.getTime());
		String strDate_1 = formatter_1.format(cal.getTime());
		System.out.println("strDate : " + strDate + "  strDate_1 : " + strDate_1);
		
	}

}
