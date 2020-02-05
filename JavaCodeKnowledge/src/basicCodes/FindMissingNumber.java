package basicCodes;

public class FindMissingNumber {

	public static void main(String[] args) {
		int n = 5;
		int[] intArr = { 1, 2, 3, 4 };
		int grandSum = (n * (n + 1)) / 2;
		int sum = 0;
		System.out.println("grandSum : " + grandSum);
		for (int i = 0; i < intArr.length; i++) {
			sum = sum + intArr[i];
		}
		System.out.println("Missing Number is : " + (grandSum - sum));
	}
}
