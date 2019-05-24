package excel.manipulation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CsvRowCount {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileName = "D:\\data\\Integration\\ftp\\processed\\DPIA_Project_Details_2019-05-12.csv";
		File source = new File("D:\\data\\Integration\\ftp\\processed\\DPIA_Project_Details_2019-04-10.csv");
		String file = "C:\\Users\\M1047624\\Desktop\\DPIA_Project_Details_2019-05-07.csv";
		String file_dDrive = "D:\\DPIA_Project_Details_2019-04-16.csv";
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file_dDrive)))) {
			Long count = br.lines().skip(1).count();
			System.out.println("Row count ----> "+count);
		}
	
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		System.out.println(date);
		System.out.println(formatter.format(date)+" source "+source.getAbsolutePath());

	}

}
