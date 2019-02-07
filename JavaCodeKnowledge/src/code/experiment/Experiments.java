package code.experiment;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class Experiments {
	public static int cnt = 0;

	public static void main(String[] args) throws IOException {
		// Reading values from application.properties file

		Resource resource = new ClassPathResource("/application.properties");
		Properties props = PropertiesLoaderUtils.loadProperties(resource);
		System.out.println("projectDevelopementType --> " + props.getProperty("project.developementType"));

		// copy file from one folder to another

		File source = new File("D:\\fileshare\\inspectmind_docs\\ftp\\User_Dump.csv");
		File dest = new File("D:/home/InspectMind/lwb_docs/processed/project/User_Dump.csv");
		if (!dest.exists()) {
			boolean result = false;
			dest.mkdir();
			result = true;
			if (result) {
				System.out.println("DIR created");
			}
		} else {
			System.out.println("DIR already exist");
		}
		try {
			FileUtils.copyFile(source, dest);
		} finally {
		}

		String teamSize = "5.6";
		double converted = new Double(teamSize); // convert string to double
		new Double(converted).longValue();
		long team_1 = Long.valueOf(teamSize); // convert double to long long team = new
//		  Double(Double.valueOf(teamSize)).longValue(); // convert double to long
		System.out.println("team :::" + converted + "   teamSize ::::" + teamSize + "    "
				+ new Double(Double.valueOf(teamSize)).longValue() + "    " + team_1);

		String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		System.out.println(formatter.format(date));
		System.out.println(new Date() + "    " + timeStamp);

// 		Execution time calculation 

		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();// nanoTime();
		NumberFormat timeFormatter = new DecimalFormat("#0.00000");
		String s = timeFormatter.format((endTime - startTime) / 1000d);
		System.out.print("Execution time is " + timeFormatter.format((endTime - startTime) / 1000d) + " seconds  " + s);

		/*
		 * File file = new File("D:\\fileshare\\inspectmind_docs\\ftp");
		 * System.out.println(file.getAbsolutePath());
		 */
//		find duplicates from list
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(6);
		l.add(7);
		l.add(1);
		Set<Integer> duplicates = new LinkedHashSet<>();
		Set<Integer> uniques = new HashSet<>();

		for (Integer t : l) {
			if (!uniques.add(t)) {
				duplicates.add(t);
			}
		}
		System.out.println(uniques + "    \n" + duplicates);

	}
} // class closed
