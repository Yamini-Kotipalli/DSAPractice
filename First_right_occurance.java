package searching;

public class First_right_occurance {
	public static void main(String args[]) {
		int arr[]= {1,2,2,2,2,2,2,2,3,4};
		int target=2;
		int left=0;
		int right=arr.length-1;
		int ans=-1; //no index found at this position
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				ans=mid;
				left=mid+1;//go right to find first occur
				
			} else if(target>arr[mid]) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		System.out.println("first right occurance:"+ans);
	}

}