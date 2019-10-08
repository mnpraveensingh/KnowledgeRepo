package hackerRank.practiceCode;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int rotationCount = 4 ;
		int temp = 0;
		int length = arr.length ;
		for(int i=1 ; i<=rotationCount ; i++) {
			temp = arr[0];
			for(int j=0 ; j<length ; j++) {
				if(j+1 == length) {
					arr[j] = temp ;
				}else {
					arr[j] = arr[j+1];
				}
				
			}
		}
		for(int k : arr) {
			System.out.println(k+" , ");
		}
	}

}
