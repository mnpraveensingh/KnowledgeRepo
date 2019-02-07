package code.experiment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Properties;

public class CreateCronExpression {

	public static void main(String[] args) throws IOException {

		Calendar now = Calendar.getInstance();
		String cronExp = "0 23 18 ? * *";
		String newCron = "";
		String hour = null;
		String minute = null;
		if (now.get(Calendar.MINUTE) < 59)
			hour = "" + now.get(Calendar.HOUR_OF_DAY);
		else {
			hour = "" + (now.get(Calendar.HOUR_OF_DAY) + 1);
		}
		if (now.get(Calendar.MINUTE) < 59)
			minute = "" + (now.get(Calendar.MINUTE) + 2);
		else {
			minute = "2";
		}
		System.out.println("" + hour + ":" + minute + "\n");
		char[] ch = cronExp.toCharArray();
		int length = 0;
		for (char c : ch) {
			if (length == 2) {
				++length;
				continue;
			} else if (length == 3) {
				newCron = newCron + minute;
			} else if (length == 5) {
				++length;
				continue;
			} else if (length == 6) {
				newCron = newCron + hour;
			} else {
				newCron = newCron + c;
			}
			++length;
		}
		System.out.println("\n cronExp -->" + cronExp + "    \n newCron --> " + newCron);
		
		FileInputStream in = new FileInputStream("D:\\new_workspace\\inspect\\lwb-integration\\src\\main\\resources\\application.properties");
		Properties props = new Properties();
		props.load(in);
		in.close();
 
		FileOutputStream out = new FileOutputStream("D:\\new_workspace\\inspect\\lwb-integration\\src\\main\\resources\\application.properties");
		props.setProperty("lwbtask.locationUpdate.cron", newCron);
		props.store(out, null);
		out.close();

		/*
		 * System.out.println("Current Hour in 12 hour format is : " +
		 * now.get(Calendar.HOUR));
		 * System.out.println("Current Hour in 24 hour format is : " +
		 * now.get(Calendar.HOUR_OF_DAY)); System.out.println("Current Minute is : " +
		 * now.get(Calendar.MINUTE)); System.out.println("Current Second is : " +
		 * now.get(Calendar.SECOND)); System.out.println("Current Millisecond is : " +
		 * now.get(Calendar.MILLISECOND));
		 */
	}
}
