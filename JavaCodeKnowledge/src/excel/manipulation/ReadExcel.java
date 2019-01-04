package excel.manipulation;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		String directoryName = "ForAccountBatch.xlsx";
		FileInputStream fileInputStream = null;
		File theFile = new File(directoryName);
		if (!theFile.exists()) {
			theFile.mkdirs();// will create
		}
		final File fileToDownload = new File(directoryName);
		fileInputStream = new FileInputStream(fileToDownload);

		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = sheet.iterator();

		while (iterator.hasNext()) {
			Row row = iterator.next();
			if (row != null && row.getRowNum() >= 1) {

				System.out.println(String.valueOf(row.getCell(0)));
				System.out.println(String.valueOf(row.getCell(1)));
				System.out.println(String.valueOf(row.getCell(2)));
				System.out.println(String.valueOf(row.getCell(3)));
				System.out.println(String.valueOf(row.getCell(4)));
			}
		}
		if (workbook != null) {
			((Closeable) workbook).close();
		}
	}

}
