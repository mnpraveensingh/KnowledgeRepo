package hackerRank.practiceCode;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class Test {

	public static void main(String[] args) throws ParseException {
		String dateStr = "2019-07-01";
		LocalDate dtObj = LocalDate.parse(dateStr);
		
		Date dateUtils = DateUtils.parseDate(dateStr, 
				  new String[] { "yyyy-MM-dd HH:mm:ss", "dd/MM-yyyy" , "yyyy-MM-DD" });
		System.out.println("dateUtils  "+dateUtils);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.parse(dtObj+""));
		System.out.println("dtObj   "+dtObj.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		LocalDateTime dateTime = LocalDateTime.parse("2019-05-15T10:00:00.0000000");
		String date = dateTime.format(DateTimeFormatter.ofPattern("dd-MMM-yy")) ;
		SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy"); 
		System.out.println("dateTime   "+dateTime.format(DateTimeFormatter.ofPattern("dd-MMM-yy")));
		System.out.println("date1   "+formatter2.parse(date) );
		/*
		 * String str = "NewChecklist (MQTM10039_v1)"; String s = "";
		 * System.out.println("str  " + str); s = str.substring(str.lastIndexOf("(") +
		 * 1, str.length() - 1).trim(); System.out.println("s  " + s);
		 * System.out.println(str.substring(0, str.lastIndexOf("(") - 1));
		 * System.out.println(str.replaceAll("&", "and")); Map<String , Object> map =
		 * new HashMap<>(); List<String> list = new ArrayList<>();
		 * list.add("Pravin Singh");list.add("Usha");list.add("Milan"); map.put("names",
		 * list); List<String> list1 = null; for(Entry<String, Object> m :
		 * map.entrySet()) { System.out.println("k  "+m.getKey()); list1 =
		 * (List<String>) m.getValue(); String[] arr =
		 * list1.stream().toArray(String[]::new); for(String string : arr) {
		 * System.out.print(string+" , "); } if(list1!=null && list1.size()>0) {
		 * list1.forEach(action->{ System.out.println(action); }); } }
		 */
	}
	
}
