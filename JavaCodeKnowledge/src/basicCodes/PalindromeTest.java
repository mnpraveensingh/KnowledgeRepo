package basicCodes;

import java.util.HashMap;
import java.util.Map;

public class PalindromeTest {
	
	public Map<String, Object> palindrome(String sampleString) {
		String result = "";
		Integer stepCount = 0;
		char[] ch = sampleString.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String temp = sampleString.substring(i + 1);
			if (!isPalindrom(temp)) {
				stepCount++;
				result = ch[i] + result;
			} else {
				stepCount++;
				result = ch[i] + result;
				break;
			}
		}
		result = sampleString + result;
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("stepCount", stepCount);
		resultMap.put("result", result);

		return resultMap;

	}

	public boolean isPalindrom(String s) {
		String isPalindrom = "";
		for (int j = s.length() - 1; j >= 0; j--) {
			isPalindrom = isPalindrom + s.charAt(j);
		}
		if (isPalindrom.equalsIgnoreCase(s)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		PalindromeTest test = new PalindromeTest();
		Map<String, Object> resultMap = test.palindrome("Pravin");
		System.out.println("result   " + resultMap.get("result"));
		System.out.println("stepCount  " + resultMap.get("stepCount"));
	}

}
