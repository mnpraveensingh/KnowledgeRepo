package hackerRank.practiceCode;

public class HourglassSum {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 1, 0, 0, 0, }, { 0, 1, 0, 0, 0, 0, }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

		int arr2[][] = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 9, 2, -4, -4, 0 },
				{ 0, 0, 0, -2, 0, 0 }, { 0, 0, -1, -2, -4, 0 } };
		int arr3[][] = { { -9, -9, -9, 1, 1, 1 }, { 0, -9, 0, 4, 3, 2 }, { -9, -9, -9, 1, 2, 3 }, { 0, 0, 8, 6, 6, 0 },
				{ 0, 0, 0, -2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		int arr1[][] = { { -1, -1, 0, -9, -2, -2 }, { -2, -1, -6, -8, -2, -5 }, { -1, -1, -1, -2, -3, -4 },
				{ -1, -9, -2, -4, -4, -5 }, { -7, -3, -3, -2, -9, -9 }, { -1, -3, -1, -2, -4, -5 } };
		int arr4[][] = { { -1, 1, -1, 0, 0, 0 }, { 0, -1, 0, 0, 0, 0 }, { -1, -1, -1, 0, 0, 0 },
				{ 0, -9, 2, -4, -4, 0 }, { -7, 0, 0, -2, 0, 0 }, { 0, 0, -1, -2, -4, 0 } };

		int largeSum = 0;
		int sum = 0;
		int verticalIncreament = 0;
		int negativeLarge = 0;
		boolean isZeroPresent = false;

		for (int vertical = 0; vertical < arr4.length - 2; vertical++) {
			verticalIncreament = vertical;
			int x = 0;
			for (int horizontal = 0; horizontal < arr4[vertical].length - 2; horizontal++) {
				while (x < 3) {
					for (int iteration = horizontal; iteration <= horizontal + 2; iteration++) {
						if (x % 2 == 0) {
							sum = sum + arr4[verticalIncreament][iteration];
						} else {
							sum = sum + arr4[verticalIncreament][iteration + 1];
							break;
						}
					}
					verticalIncreament++;
					x++;
				}
				System.out.println("sum " + sum);
				if (sum < 0 && negativeLarge == 0) {
					System.out.println("sum   " + sum);
					negativeLarge = sum;
				} else if (negativeLarge < sum) {
					if (sum == 0) {
						isZeroPresent = true;
					}
					negativeLarge = sum;
				}
				if (largeSum < sum) {
					largeSum = sum;
				}
				sum = 0;
				x = 0;
				verticalIncreament = vertical;
			}
		}
		if (largeSum == 0 && isZeroPresent != true) {
			System.out.println("largeSum = " + negativeLarge);
		} else {
			System.out.println("largeSum  " + largeSum);
		}
	}

}
