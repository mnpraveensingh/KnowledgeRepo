package basicCodes;

public class SumArrElementExceptCurrentElement {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		int[] newArr = new int[intArr.length];
		int grandSum = 0;
		for (int i : intArr) {
			grandSum = grandSum + i;
		}
		for (int i = 0; i < intArr.length; i++) {
			newArr[i] = grandSum - intArr[i];
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}

}
