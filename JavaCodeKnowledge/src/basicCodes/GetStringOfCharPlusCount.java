package basicCodes;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetStringOfCharPlusCount {

	public static void main(String[] args) {
		String str = "aabbccdde"; // Output = a2b2c2d2e1
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				int cnt = map.get(c) + 1;
				map.put(c, cnt);
			} else {
				map.put(c, 1);
			}
		}
		StringBuffer sb = new StringBuffer();
		map.forEach((k, v) -> {
			if (v > 1) {
				sb.append(k);
				sb.append(v);
			}
		});
		System.out.println("Output String : " + sb.toString());
	}

}
