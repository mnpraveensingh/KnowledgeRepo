package pdfCreation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PdfManipulation {

	public static final String SRC = "C:\\Users\\M1047624\\Downloads\\MQRQ10330v1_en_1571910607711.pdf";
	public static final String DEST = "C:\\Users\\M1047624\\Downloads\\pagenumbers" + System.currentTimeMillis()
			+ ".pdf";

	public static void main(String[] args) throws IOException, DocumentException {
		File file = new File(DEST);
		file.getParentFile().mkdirs();
		new PdfManipulation().manipulatePdf(SRC, DEST);
	}

	public void manipulatePdf(String src, String dest) throws IOException, DocumentException {
		PdfReader reader = new PdfReader(src);
		int n = reader.getNumberOfPages();

		Font smallItalic = new Font(Font.FontFamily.HELVETICA, 8, Font.ITALIC);

		PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(dest));
		PdfContentByte pagecontent;
		for (int i = 0; i < n;) {
			pagecontent = stamper.getOverContent(++i);
			ColumnText.showTextAligned(pagecontent, Element.ALIGN_CENTER,
					new Phrase(String.format("page %s of %s", i, n), smallItalic), 300f, 5f, 0);
			if (i == n) {
				
				String textFromPage = PdfTextExtractor.getTextFromPage(reader, n);
				
				ColumnText.showTextAligned(pagecontent, Element.ALIGN_CENTER, new Phrase(textFromPage+
						"\n\n--------------------------*---------------------------*-"
					+   "--------------------------*---------------------------*---------------------------"),
						300f, 200f, 0);
			}
		}
		stamper.close();
		reader.close();
	}

}
