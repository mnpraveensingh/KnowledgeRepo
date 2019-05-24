package code.experiment;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.time.DateUtils;

public class DateFormatterUsingDateUtils {

	public static void main(String[] args) throws ParseException {
		String csvFile = "D:\\fileshare\\inspectmind_docs\\ftp\\project1.csv";
		String Project_Planned_Start_Date = null ;
		String Project_Planned_End_Date = null ;
		String Project_Actual_End_Date = null ;
		String Forecasted_End_Date = null ;
		try (Reader reader = Files.newBufferedReader(Paths.get(csvFile));
				CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);) {
				for (CSVRecord csvRecord : csvParser) {
					// Accessing Values by Column Index
					if(csvParser.getCurrentLineNumber()>1) {
						if(csvRecord.get(25)!=null && !csvRecord.get(25).equals("")) {
							 Project_Planned_Start_Date = dateFormatter(csvRecord.get(25));
						}
						if(csvRecord.get(26)!=null && !csvRecord.get(26).equals("")) {
							Project_Planned_End_Date = dateFormatter(csvRecord.get(26));
						}
						if(csvRecord.get(27)!=null && !csvRecord.get(27).equals("")) {
							Project_Actual_End_Date = dateFormatter(csvRecord.get(27));
						}
						if(csvRecord.get(28)!=null && !csvRecord.get(28).equals("")) {
							Forecasted_End_Date = dateFormatter(csvRecord.get(28));
						}

						System.out.println("Record No - " + csvRecord.getRecordNumber());
						System.out.println("---------------");
						System.out.println(
								"Project_Planned_Start_Date : " + Project_Planned_Start_Date + "     " + csvRecord.get(25));
						System.out.println(
								"Project_Planned_End_Date : " + Project_Planned_End_Date + "     " + csvRecord.get(26));
						System.out.println(
								"Project_Actual_End_Date : " + Project_Actual_End_Date + "     " + csvRecord.get(27));
						System.out.println("Forecasted_End_Date : " + Forecasted_End_Date + "     " + csvRecord.get(28));
						System.out.println("---------------\n\n");	
					}
				}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static String dateFormatter(String date) throws ParseException {
		Date newDate = DateUtils.parseDate(date, new String[] { "yyyy-MM-dd HH:mm:ss", "M/d/yyyy", "M/d/yyyy h:mm" });
		Instant instant = newDate.toInstant();
		ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
		LocalDate date1 = zdt.toLocalDate();
		SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat newSimpleFormatter = new SimpleDateFormat("M/d/yyyy h:mm");
		String modifiedDate = null;
		try {
			Date date_1 = simpleFormatter.parse("" + date1);
			modifiedDate = newSimpleFormatter.format(date_1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return modifiedDate;
	}

}
