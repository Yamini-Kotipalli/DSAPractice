package dsac3_arraysmethods;

public class binarysearch {
	public static void main(String[] args) {
		// Binary Search
		
		int arr[] = {1,2,3,5,6};
		int target = 3;
		// declare two variables left and right 
		
		int left =0;
		int right = arr.length-1;
		
		while(left<=right) {
			int mid =(left+right)/2;
			if(arr[mid]==target) {
				System.out.println("found at "+mid);
				return;
			}else if(arr[mid]<target){
				left = mid+1;
			}
			else {
				right = mid -1;
			}
		}
		System.out.println("no element found");
		
	}

}
