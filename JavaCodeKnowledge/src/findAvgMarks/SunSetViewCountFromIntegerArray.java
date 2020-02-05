package findAvgMarks;

public class SunSetViewCountFromIntegerArray {

	public static void main(String[] args) {
		/*
		 * to get the view of sunset if no any big building present before next building
		 * and print its count
		 */
		/*
		 * if any big building present before smaller one then that building not able to
		 * see what is in front of that building
		 */
		int[] arr = { 4, 9, 6, 9, 4, 5, 7, 6, 8, 10, 11 }; // each number represent building size
		int cnt = 0;
		boolean flag = true;
		if (arr != null && arr.length > 0) {
			for (int i = 0; i < arr.length; i++) {
				if (i == 0) {
					cnt = 1;
				} else {
					for (int j = 0; j < i; j++) {
						if (arr[i] <= arr[j]) {
							flag = false;
							break;
						} else {
							flag = true;
						}
					}
					if (flag) {
						cnt = cnt + 1;
					}
				}
			}
		}
		System.out.println(cnt + " : cnt");
	}
}
