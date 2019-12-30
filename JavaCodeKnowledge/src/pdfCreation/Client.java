package pdfCreation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

public class Client {

	private static final String TITLE = "TestReport";
	public static final String PDF_EXTENSION = ".pdf";

	public static void main(String[] args) {

		List<DataObject> dataObjList = getDataObjectList();
		Document document = null;
		try {
			// Document is not auto-closable hence need to close it separately
			document = new Document(PageSize.A4);
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(new File(TITLE + PDF_EXTENSION)));
			HeaderFooter event = new HeaderFooter();
			event.setHeader("Test Report");
			writer.setPageEvent(event);
			document.open();
			PDFCreator.addMetaData(document, TITLE);
			PDFCreator.addTitlePage(document, TITLE);
			PDFCreator.addContent(document, dataObjList);
		} catch (DocumentException | FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FileNotFoundException occurs.." + e.getMessage());
		} finally {
			if (null != document) {
				document.close();
			}
		}
	}

	public static List<DataObject> getDataObjectList() {
		List<DataObject> dataObjList = new ArrayList<DataObject>();
		for (int i = 1; i <= 1000; i++) {
			DataObject d1 = new DataObject();
			d1.setComanyName("ABC_" + i);
			d1.setIncome("20000_" + i);
			d1.setYear("2017_" + i);
			dataObjList.add(d1);
		}
		return dataObjList;
	}

}
