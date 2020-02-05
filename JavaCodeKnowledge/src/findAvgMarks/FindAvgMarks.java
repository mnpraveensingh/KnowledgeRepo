package findAvgMarks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindAvgMarks {

	public static void main(String[] args) {
		String[][] twoDArray = { { "milan", "100" }, { "pravin", "87" }, { "usha", "56" }, { "milan", "27" },
				{ "usha", "20" } };
		Map<String, User> map = new HashMap<>();
		for (int i = 0; i < twoDArray.length; i++) {
			String name = twoDArray[i][0];
			if (map.containsKey(twoDArray[i][0])) {
				int marks = Integer.valueOf(twoDArray[i][1]) + map.get(name).getMarks();
				int cnt = map.get(name).getCount() + 1;
				int avg = marks / cnt;
				User user = new User(marks, 1, avg);
				map.put(name, user);
			} else {
				int marks = Integer.valueOf(twoDArray[i][1]);
				int avg = Integer.valueOf(twoDArray[i][1]) / 1;
				User user = new User(marks, 1, avg);
				map.put(name, user);
			}
		}
		int max = 0;
		for (Entry<String, User> entry : map.entrySet()) {
			if (max < entry.getValue().getAvg()) {
				max = entry.getValue().getAvg();
			}
		}
		System.out.println("max : " + max);
	}
}