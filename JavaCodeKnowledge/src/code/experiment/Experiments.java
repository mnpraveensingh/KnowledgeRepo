package code.experiment;

import java.io.IOException;

public class Experiments {

	public static void main(String[] args) throws IOException {

		// copy file from one folder to another
		/*
		 * File source = new
		 * File("D:\\fileshare\\inspectmind_docs\\ftp\\User_Dump.csv"); File dest = new
		 * File("D:\\fileshare\\inspectmind_docs\\processed\\User_Dump.csv"); if
		 * (!dest.exists()) { boolean result = false; dest.mkdir(); result = true; if
		 * (result) { System.out.println("DIR created"); } }else {
		 * System.out.println("DIR already exist"); } try { FileUtils.copyFile(source,
		 * dest); }finally {}
		 */

		String teamSize = "5.6";
		double converted = new Double(teamSize); // convert string to double
		new Double(converted).longValue();
		long team_1 = Long.valueOf(teamSize); // convert double to long
		long team = new Double(Double.valueOf(teamSize)).longValue(); // convert double to long
		System.out.println("team :::" + converted + "   teamSize ::::" + teamSize + "    "
				+ new Double(Double.valueOf(teamSize)).longValue() + "    " + team + "    " + team_1);
	}

}
