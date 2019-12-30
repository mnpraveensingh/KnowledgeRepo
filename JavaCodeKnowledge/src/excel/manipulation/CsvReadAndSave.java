package excel.manipulation;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CsvReadAndSave {

	public static void main(String[] args) throws IOException {
		String csvFile = "C:\\Users\\M1047624\\Desktop\\DPIA_Project_Details_2019-11-06.csv";
		CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');
		CSVParser parser = new CSVParser(new FileReader(csvFile), format);
		List<String> qcs = new ArrayList<>();
		for(CSVRecord record : parser){
			String qc = record.get(20)+" ("+record.get(19)+") line number "+record.getRecordNumber();
			System.out.println(qc);
			qcs.add(qc);
		}
		parser.close();		
		System.out.println(qcs.size());
	}

}
