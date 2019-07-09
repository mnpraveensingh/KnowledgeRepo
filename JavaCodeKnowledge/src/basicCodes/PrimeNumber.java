package basicCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start");
		int start = sc.nextInt();
		System.out.println("End");
		int end = sc.nextInt();
		List<Integer> primeList = new ArrayList<>();
		for(int i=start ; i<=end ; i++) {
			if(isPrime(i)) {
				primeList.add(i);
			}
		}
		System.out.println(primeList);
		sc.close();
	}
	
	public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       } 
	       /*for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           } */
	       for (int i = 2; i <= n/2; i++) {  
	           if (n % i == 0) {  
	               return false;  
	           } 
	       }  
	       return true;  
	   }  

}
