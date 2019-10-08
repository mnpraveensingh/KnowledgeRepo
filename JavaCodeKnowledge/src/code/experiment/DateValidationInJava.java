package code.experiment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

import org.apache.commons.lang3.time.DateUtils;

import constant.Constant;

/**
 * @author M1047624
 *
 */
public class DateValidationInJava {


static Logger logger = Logger.getLogger(DateValidationInJava.class.getName());
	public static void main(String[] args) throws ParseException {

//		String dateInString = "03/31/2014 00:00";
		String dateInString = "2008-06-02";
		Date newDate = DateUtils.parseDate(dateInString, 
				  new String[] { "yyyy-MM-dd HH:mm:ss", "M/d/yyyy" , "M/d/yyyy h:mm" , "yyyy-MM-dd"});
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
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy h:mm");
          LocalDate localDate = LocalDate.parse(modifiedDate, formatter);
          logger.info("localDate ---- > " +localDate);
      } catch (ParseException e) {
          e.printStackTrace();
      }
		yearDateMonthTypeDateFormate();
	}
	
	private static void yearDateMonthTypeDateFormate() throws ParseException {
		String projectCreatedDateTo="2019-08-30"; // 2008-06-02
		String projectCreatedDateFrom="2019-07-01";
		Date to = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(projectCreatedDateTo);
		Date from = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(projectCreatedDateFrom);
		System.out.println(Constant.GREEN_BOLD+"From   "+from+"   To  "+to);
	}
}
