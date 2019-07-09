package basicCodes;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "pravin";
		String str2 = "vinpra";

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		if (ch1.length != ch2.length) {
			System.out.println("Not an Anagram length");
		} else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			int cnt = 0;
			for (int i = 0; i < ch1.length; i++)
				if (ch1[i] != ch2[i]) {
					cnt++;
				}
			if (cnt > 0) {
				System.out.println("not an Anagram");
			} else {
				System.out.println("Anagram");
			}
		}
	}

}
