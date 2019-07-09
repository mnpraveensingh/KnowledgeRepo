package basicCodes;

public class SecondLargeFromArray {

	public static void main(String[] args) {
		int[] arr = {3 , 5 , 2 , 1 , 10};
		int large = 0 ;
		int secLarge = 0 ;
		if(arr[0]>arr[1]) {
			large = arr[0];
			secLarge = arr[1];
		}else {
			large = arr[1];
			secLarge = arr[0];
		}
		for(int i=2 ; i<arr.length ; i++) {
			if(arr[i]>large && secLarge<arr[i]) {
				secLarge = large;
				large = arr[i];				
			}else if(arr[i]>secLarge) {
				secLarge = arr[i];
			}
		}
		System.out.println("large "+large+"    secLarge  "+secLarge);
	}

}
