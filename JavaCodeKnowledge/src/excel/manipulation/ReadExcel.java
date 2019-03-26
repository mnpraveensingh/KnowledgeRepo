package excel.manipulation;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author M1047624
 *
 */
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
		
		System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
		Iterator<XSSFSheet> sheetIterator = workbook.iterator();
        System.out.println("Retrieving Sheets using Iterator");
        while (sheetIterator.hasNext()) {
        	XSSFSheet sheet_1 = sheetIterator.next();
            System.out.println("=> " + sheet_1.getSheetName());
        }
        
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            System.out.println("Sheet name: " + workbook.getSheetName(i));
        }
        
        System.out.println("Retrieving Sheets using for-each loop");
        for(XSSFSheet sheet_2: workbook) {
            System.out.println("=> " + sheet_2.getSheetName());
        }
        
        System.out.println("Retrieving Sheets using Java 8 forEach with lambda");
        workbook.forEach(sheet_3 -> {
            System.out.println("=> " + sheet_3.getSheetName());
        });

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
		// Create a DataFormatter to format and get each cell's value as String
		DataFormatter dataFormatter = new DataFormatter();
		System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
        for (Row row: sheet) {
            for(Cell cell: row) {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\n\nIterating over Rows and Columns using Java 8 forEach with lambda\n");
        sheet.forEach(row -> {
            row.forEach(cell -> {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            });
            System.out.println();
        });
		if (workbook != null) {
			((Closeable) workbook).close();
		}
	}
	
//	Total Row Count from CSV File 
	/*public static void main(String[] args) throws IOException  {
		File inputF = new File("D:\\fileshare\\inspectmind_docs\\ftp\\DPIA_Project_Details_2019-02-12.csv");
	      InputStream inputFS = new FileInputStream(inputF);
	      BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
	      // skip the header of the csv
	      Long count = br.lines().skip(1).count();
	      System.out.println(count+"    count");
	      Integer cnt = count.intValue();
	      System.out.println("cnt    "+cnt);
	      br.close();

	}*/

}
