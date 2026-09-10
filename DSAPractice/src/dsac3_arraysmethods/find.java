package dsac3_arraysmethods;

public class find {
	public static void main(String[] args) {
		// finding elements using sorted array
		
		
		int arr[] = {1,2,3,4,5};
		int target = 5;
		boolean found = false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				found = true;
			}
			if(arr[i]>target) {
				break;
			}
		}
		System.out.println(found?"element found":"not found");
	
		
	}

}
