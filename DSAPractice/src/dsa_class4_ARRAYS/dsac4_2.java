package dsa_class4_ARRAYS;



public class dsac4_2 {
	public static void main(String[] args) {
		int[] arr = {1,2,2,2,2,2,2,2,3,3,4,4,};
		int target = 2;
		int left = 0;
		int right = arr.length-1;
		
		while(left<=right) {
			
			int mid = (left+right)/2;
			int cmp = arr[mid].compareTo(target);
			
			if(cmp==0) {
				
				System.out.println("found at:"+ mid);
				return;
			}
			
			else if(cmp>0) {
				right= mid - 1;
			}
			
			else {
				left = mid+1;
			}
		}
		
		System.out.println("not found....");
		
	}

}
