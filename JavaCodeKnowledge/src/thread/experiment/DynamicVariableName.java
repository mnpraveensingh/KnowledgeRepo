package thread.experiment;

import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.Paragraph;

public class DynamicVariableName {

	public static void main(String[] args) {
		List<String> variableName = new ArrayList<>();
		variableName.add("1");
		variableName.add("2");
		variableName.add("3");
		variableName.add("4");
		variableName.add("5");
		variableName.add("6");
		variableName.forEach(action->{
			try {
				Paragraph.class.getField("paragraph_" + action).set("Something", "");
				System.out.println(Paragraph.class.getName());
			} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
				e.printStackTrace();
			}
		});
	}

}
