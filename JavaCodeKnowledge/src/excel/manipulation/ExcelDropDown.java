package excel.manipulation;

import java.util.List;

import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDropDown {

	public static void createDropdown(XSSFWorkbook xcelObject, XSSFSheet sheet,List<String> dropdownList) {
		XSSFRow row = sheet.getRow(0);
		CreationHelper createHelper = xcelObject.getCreationHelper();
		XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
		DataValidationHelper validationHelper = new XSSFDataValidationHelper(sheet);
//		MasterManager masterManager = LWBServiceUtil.getApplicationObjectByClassName(MasterManager.class);

		if (row.getCell(0).getStringCellValue().equalsIgnoreCase("Account ID (M)")) {
			XSSFSheet hidden = xcelObject.createSheet("AccountIdList");
			
			String[] dropdownVal = new String[dropdownList.size()];
			for (int cnt = 0; cnt < dropdownList.size(); cnt++) {
				String name = dropdownList.get(cnt);
				XSSFRow row1 = hidden.createRow(cnt);
				XSSFCell cell = row1.createCell(0);
				cell.setCellValue(name);
				dropdownVal[cnt] = dropdownList.get(cnt);
			}
			CellRangeAddressList addressList = new CellRangeAddressList(1, 200, row.getCell(0).getColumnIndex(),
					row.getCell(0).getColumnIndex());
			DataValidationConstraint constraint = validationHelper.createExplicitListConstraint(dropdownVal);
			constraint = validationHelper.createFormulaListConstraint("AccountIdList!$A$1:$A$" + dropdownVal.length);
			DataValidation dataValidation = validationHelper.createValidation(constraint, addressList);
			dataValidation.setSuppressDropDownArrow(true);
			xcelObject.setSheetHidden(1, true);
			sheet.addValidationData(dataValidation);
		}

		if (row.getCell(7).getStringCellValue().equalsIgnoreCase("City (M)")) {
			XSSFSheet hidden1 = xcelObject.createSheet("CityList");
			String[] dropdownVal = new String[dropdownList.size()];
			for (int cnt = 0; cnt < dropdownList.size(); cnt++) {
				String name = dropdownList.get(cnt);
				XSSFRow row1 = hidden1.createRow(cnt);
				XSSFCell cell = row1.createCell(0);
				cell.setCellValue(name);
				dropdownVal[cnt] = dropdownList.get(cnt);
			}
			CellRangeAddressList addressList = new CellRangeAddressList(1, 200, row.getCell(7).getColumnIndex(),
					row.getCell(7).getColumnIndex());
			DataValidationConstraint constraint = validationHelper.createExplicitListConstraint(dropdownVal);
			constraint = validationHelper
					.createFormulaListConstraint("CityList!$A$1:$A$" + dropdownVal.length);
			DataValidation dataValidation = validationHelper.createValidation(constraint, addressList);
			dataValidation.setSuppressDropDownArrow(true);
			xcelObject.setSheetHidden(1, true);
			sheet.addValidationData(dataValidation);
		}

		if (row.getCell(15).getStringCellValue().equalsIgnoreCase("Project ID (M)")) {
			XSSFSheet hidden1 = xcelObject.createSheet("ProjectIdList");
			String[] dropdownVal = new String[dropdownList.size()];
			for (int cnt = 0; cnt < dropdownList.size(); cnt++) {
				String name = dropdownList.get(cnt);
				XSSFRow row1 = hidden1.createRow(cnt);
				XSSFCell cell = row1.createCell(0);
				cell.setCellValue(name);
				dropdownVal[cnt] = dropdownList.get(cnt);
			}
			CellRangeAddressList addressList = new CellRangeAddressList(1, 200, row.getCell(15).getColumnIndex(),
					row.getCell(15).getColumnIndex());
			DataValidationConstraint constraint = validationHelper.createExplicitListConstraint(dropdownVal);
			constraint = validationHelper
					.createFormulaListConstraint("ProjectIdList!$A$1:$A$" + dropdownVal.length);
			DataValidation dataValidation = validationHelper.createValidation(constraint, addressList);
			dataValidation.setSuppressDropDownArrow(true);
			xcelObject.setSheetHidden(1, true);
			sheet.addValidationData(dataValidation);
		}
	}
}
