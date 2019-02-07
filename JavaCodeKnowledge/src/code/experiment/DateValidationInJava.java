package code.experiment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.logging.Logger;

import org.apache.commons.lang3.time.DateUtils;

/**
 * @author M1047624
 *
 */
public class DateValidationInJava {


static Logger logger = Logger.getLogger(DateValidationInJava.class.getName());
	public static void main(String[] args) throws ParseException {

		String dateInString = "03/31/2014 00:00";
		Date newDate = DateUtils.parseDate(dateInString, 
				  new String[] { "yyyy-MM-dd HH:mm:ss", "M/d/yyyy" , "M/d/yyyy h:mm" });
		Instant instant = newDate.toInstant();
		ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
		LocalDate date1 = zdt.toLocalDate();
		SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat newSimpleFormatter = new SimpleDateFormat("M/d/yyyy h:mm");
		String modifiedDate = null;
		try {

          Date date_1 = simpleFormatter.parse(""+date1);
          modifiedDate = newSimpleFormatter.format(date_1);
          logger.info("modifiedDate ---- > " +modifiedDate);
      } catch (ParseException e) {
          e.printStackTrace();
      }
	}
}
