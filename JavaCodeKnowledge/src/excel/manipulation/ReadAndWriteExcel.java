package excel.manipulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author M1047624
 *
 */
public class ReadAndWriteExcel {
	// for reading excel
	private static final String PROJECT_FILE_NAME = "C:\\Users\\M1047624\\Desktop\\ProjectBulkUploadExcelTemplate (11).xlsx";

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
//		D://lwb_docs/requestdocs/SampleFolder/ProjectBulkUploadExcelTemplate.xlsx  ===> for output file
		sampleProjectExcelDataHeader(workbook, "D://lwb_docs/requestdocs/SampleFolder/ProjectBulk"+System.currentTimeMillis()+".xlsx");

	}

	public static String sampleProjectExcelDataHeader(XSSFWorkbook xcelObject, String xlsxFilename) throws IOException {
		List<String> list = new ArrayList<>();
		list.add("Account ID (M)");
		list.add("Project Name (M)");
		list.add("Alias (O)");
		list.add("Region (M)");
		list.add("Country (M)");
		list.add("State (M)");
		list.add("County (M)");
		list.add("City (M)");
		list.add("Territory (M)");
		list.add("Address 1 (M)");
		list.add("Address 2 (M)");
		list.add("Zip (M)");
		list.add("Longitude (M)");
		list.add("Latitude (M)");
		list.add("DUNS (M)");
		list.add("Project ID (M)");
		list.add("Delivery Head (M)");
		list.add("Horizontal (M)");
		list.add("Digital/SMAC (M)");
		list.add("Digital Sub Area (M)");
		list.add("Project Development Type (M)");
		list.add("Engagement Model (M)");
		list.add("Ownership (M)");
		list.add("DM (O)");
		list.add("QC (O)");
		list.add("PM (O)");
		list.add("DP (O)");
		list.add("Project Planned Start Date(MM/DD/YY) (M)");
		list.add("Project Planned End Date(MM/DD/YY) (M)");
		list.add("Project Actual End Date(MM/DD/YY) (M)");
		list.add("Forecasted End Date(MM/DD/YY) (M)");
		list.add("Team Size (M)");
		list.add("Contract Value (O)");
		list.add("FY YTD Revenue (O)");
		/* list.add("");list.add("");list.add("");list.add(""); */
		Map<String, Integer> column = new HashMap<>();
		for (String str : list) {
			column.put(str, list.indexOf(str));
		}
		String fileName = createProjectSampleExcel(column, xcelObject, xlsxFilename, list);
		return fileName;
	}

	public static List<String> mandatProjectDataList() {
		List<String> list = new ArrayList<>();
		list.add("Account ID (M)");
		list.add("Project Name (M)");
		list.add("Region (M)");
		list.add("Country (M)");
		list.add("State (M)");
		list.add("County (M)");
		list.add("City (M)");
		list.add("Territory (M)");
		list.add("Address 1 (M)");
		list.add("Address 2 (M)");
		list.add("Zip (M)");
		list.add("Longitude (M)");
		list.add("Latitude (M)");
		list.add("DUNS (M)");
		list.add("Project ID (M)");
		list.add("Delivery Head (M)");
		list.add("Horizontal (M)");
		list.add("Digital/SMAC (M)");
		list.add("Digital Sub Area (M)");
		list.add("Project Development Type (M)");
		list.add("Engagement Model (M)");
		list.add("Ownership (M)");
		list.add("Project Planned Start Date(MM/DD/YY) (M)");
		list.add("Project Planned End Date(MM/DD/YY) (M)");
		list.add("Project Actual End Date(MM/DD/YY) (M)");
		list.add("Forecasted End Date(MM/DD/YY) (M)");
		list.add("Team Size (M)");
		return list;
	}

	public static String createProjectSampleExcel(Map<String, Integer> columnName, XSSFWorkbook xcelObject,
			String xlsxFilename, List<String> list1) throws IOException {
		int rowCount = 0;
		XSSFSheet sheet = xcelObject.createSheet("projectSampleData");

		List<String> list = mandatProjectDataList();
		CellStyle color = xcelObject.createCellStyle();

		Row header = sheet.createRow(rowCount++);
		for (Entry<String, Integer> entry : columnName.entrySet()) {
			Cell cell = header.createCell(entry.getValue());
			// for mandatory fields index color
			if (list.contains(entry.getKey())) {
				cell.setCellType(Cell.CELL_TYPE_STRING);
				color.setFillForegroundColor(IndexedColors.RED.getIndex());
				color.setFillPattern(CellStyle.SOLID_FOREGROUND);
				cell.setCellValue(entry.getKey());
				cell.setCellStyle(color);
			} else {
				cell.setCellType(Cell.CELL_TYPE_STRING);
				cell.setCellValue(entry.getKey());
			}
			// cell.setCellValue(entry.getKey());
			XSSFCellStyle style = xcelObject.createCellStyle();
			style.setBorderTop((short) 6); // double lines border
			style.setBorderBottom((short) 1); // single line border
			XSSFFont font = xcelObject.createFont();
			font.setFontHeightInPoints((short) 11);
			font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
			style.setFont(font);
		}
		List<String> dropdownList = DropdownListData.dropdownList();
		ExcelDropDown.createDropdown(xcelObject,sheet,dropdownList);
		setProjectExcelValue(header, xcelObject, rowCount, sheet, list1);		

		FileOutputStream out = new FileOutputStream(new File(xlsxFilename));
		xcelObject.write(out);
		out.close();
		return xlsxFilename;
	}

	public static void setProjectExcelValue(Row header, XSSFWorkbook xcelObject, int rowCount, XSSFSheet sheet,
			List<String> list1) throws IOException {
		FileInputStream excelFile = new FileInputStream(new File(PROJECT_FILE_NAME));
		XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
		XSSFSheet datatypeSheet = workbook.getSheetAt(2);
		XSSFRow row;
		Iterator<?> rows = datatypeSheet.rowIterator();
		int count = 0;
		CellStyle style = xcelObject.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	    style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		while (rows.hasNext()) {
			int columnCount = 0;
			row = (XSSFRow) rows.next();
			if (count != 0) {
				header = sheet.createRow(rowCount++);
				for (int i = 0; i < row.getLastCellNum(); i++) {
					Cell cell = header.createCell(columnCount);
					String s = null;
					if (list1.get(i).equals("Zip (M)")) {
						s = row.getCell(i).toString();
						long l = (long) Double.parseDouble(s);
						s = "" + l;
						cell.setCellStyle(style);
					} else if (row.getCell(i) != null) {
						s = row.getCell(i).toString();
					}
					if (s != null)
						cell.setCellValue(s);
					columnCount++;
				}
			}
			++count;

		}
	}
}
