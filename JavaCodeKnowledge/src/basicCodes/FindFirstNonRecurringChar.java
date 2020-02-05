package basicCodes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRecurringChar {

	public static void main(String[] args) {
		String str = "aabbcdec";
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : charArray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		char firstNonRepeatingChar = 0;
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				firstNonRepeatingChar = entry.getKey();
				break;
			}
		}
		System.out.println("firstNonRepeatingChar : " + firstNonRepeatingChar);
	}
}
