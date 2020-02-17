package basicCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		int start = 1;
		int end = 20;
		List<Integer> primeList = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			/*
			 * if(isPrime(i)) { primeList.add(i); }
			 */
			if (isPrimeNum(i)) {
				primeList.add(i);
			}
		}
		System.out.println(primeList);
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		/*
		 * for (int i = 2; i <= Math.sqrt(n); i++) { if (n % i == 0) { return false; }
		 */
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPrimeNum(int number) {
		return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);
	}

}
