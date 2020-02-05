package findAvgMarks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetCntRepeatingNumIfSizeGreaterArrSize {

	public static void main(String[] args) {
		// print the max count of the repeating number and which number is repeating if
		// its count is greater then half of the array size
		int[] arr = { 9, 9, 9, 9, 4, 0, 7, 0, 8, 9, 99 };
		int halfArrSize = arr.length / 2;
		int large = 0;
		int num = 0;
		if (arr != null && arr.length > 0) {
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < arr.length; i++) {
				if (map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i]) + 1);
				} else {
					map.put(arr[i], 1);
				}
			}
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				if (large < entry.getValue()) {
					large = entry.getValue();
					num = entry.getKey();
				}
			}
		} else {
			System.out.println("Please make sure Array must not empty !");
		}
		if (large > halfArrSize)
			System.out.println("num " + num + " large " + large);
		else
			System.out.println("no number repeating more then half of the array size");
	}
}
