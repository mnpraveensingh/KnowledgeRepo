package code.experiment;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class ExperimentForIntegration {

	public static void main(String[] args) throws ParseException {

		List<String> l = new ArrayList<>();
		l.add("ABC");l.add("DEF");
		int size = l.size();
		
		StringBuffer sb = new StringBuffer();
		l.forEach(action->{
			if(l.indexOf(action)+1 != size)
			sb.append(action+"----");
			else
				sb.append(action);
		});
		System.out.println(sb.toString());
		String survey = "[ \"MQLO10049v1\"]";
		String status = "[ \"Assigned\"]";
		String date = "[ \"$date\" : \"2019-05-28T11:27:49.451Z\"]";
		
		System.out.println(survey.substring(StringUtils.lastOrdinalIndexOf(survey, "\"", 2) + 1, survey.lastIndexOf("\"")));
		System.out.println(status.substring(StringUtils.lastOrdinalIndexOf(status, "\"", 2) + 1, status.lastIndexOf("\"")));
		System.out.println(date.substring(StringUtils.lastOrdinalIndexOf(date, "\"", 2) + 1, date.lastIndexOf("\"")));
	}
}
