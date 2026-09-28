package searching;

public class Insert_Position {
	public static void main(String args[]) {
		int arr[]= {1,3,4,5,6};
		int target=2;
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		System.out.println("position is:"+left);
	}

}