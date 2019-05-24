package excel.manipulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToCsvConversion {
// only if don't have any drop down's
	public static void main(String[] args) throws IOException {
		String directoryName = "D:\\data\\lwb_docs\\surveyreport\\ProjectBulkUploadExcelTemplate (11).xlsx";
		String csvDirectoryName = "C:\\Users\\M1047624\\Desktop\\Desktop.csv";
		
		FileInputStream fileInputStream = null;
		File theFile = new File(directoryName);
		File csvFile = new File(csvDirectoryName);
		System.out.println("csvDirectoryName "+csvFile.getAbsolutePath());
		if (!theFile.exists()) {
			theFile.mkdirs();// will create
		}
		if (!csvFile.exists()) {
			theFile.mkdirs();// will create
		}
		final File fileToDownload = new File(directoryName);
		fileInputStream = new FileInputStream(fileToDownload);

		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

		DataFormatter formatter = new DataFormatter();
		PrintStream out = new PrintStream(new FileOutputStream(csvDirectoryName), true, "UTF-8");

		for (XSSFSheet sheet : workbook) {
			for (Row row : sheet) {
				boolean firstCell = true;
				for (Cell cell : row) {
					if (!firstCell)
						out.print(',');
					String text = formatter.formatCellValue(cell);
					out.print(text);
					firstCell = false;
				}
				out.println();
			}
		}
		if (out != null) {
			out.close();
		}


	}

}
