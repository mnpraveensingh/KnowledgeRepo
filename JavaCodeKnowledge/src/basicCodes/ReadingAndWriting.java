package basicCodes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingAndWriting {

	public static void main(String[] args) {

		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("sample.txt"))){
			String str = null;
			FileWriter fileWriter = new FileWriter("newSample.txt" , true);
			while((str = bufferedReader.readLine()) != null) {
				fileWriter.write(str);
				fileWriter.write("\n");
			}
			fileWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
