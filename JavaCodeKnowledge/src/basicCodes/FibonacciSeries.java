package basicCodes;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter starting");
		int n = sc.nextInt();
		int[] fibonacci = new int[n+1];
		fibonacci[0] = 0;
		fibonacci[1] = 1 ;
		
		for(int i=2 ; i<=n ; i++) {
			fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
		}
		for(int x : fibonacci) {
			System.out.print(x+" ");
		}
	}

}
