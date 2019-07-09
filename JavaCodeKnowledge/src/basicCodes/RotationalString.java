package basicCodes;

public class RotationalString {

	public static void main(String[] args) {
		String str1 = "Pravin";
		String str2 = "avinPr";
		System.out.println(str1+str1);
		if(str1.length() == str2.length() && (str1+str1).indexOf(str2)!=-1) {
			System.out.println("Rotational Strings");
		}else {
			System.out.println("Not Rotational Strings");
		}
	}

}
