package basicCodes;

import java.io.FileWriter;
import java.io.IOException;

public class WritingTextInFile {

	public static void main(String[] args) {
		String str = "From Java 7, you can use try-with-resources statement to simplify the code of opening and closing the reader/writer. For example:";
		try(FileWriter fileWriter = new FileWriter("sample.txt" , true)) {
			Character character = null ;
			fileWriter.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
