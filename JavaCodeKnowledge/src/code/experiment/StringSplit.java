package code.experiment;

/**
 * @author M1047624
 *
 */
public class StringSplit {

	public static void main(String[] args) {
		String str = "Pravin Singh (M1047624)";
		String name = str.split("\\(")[0].trim();
		String s = str.split("\\(")[1].split("\\)")[0];
		System.out.println("string  "+s+"   "+name);

	}

}
