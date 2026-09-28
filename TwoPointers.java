import java.util.Arrays;

public class TwoPointers {

	public static void main(String[] args) {
		int arr[]= {2,4,1,3,5};
		int target=6;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
	}
		
		int left=0;
		int right=arr.length-1;
	while(left<right)	{
	int sum=arr[left]+arr[right];
	if(sum==target) {
		System.out.println(arr[left]+" "+arr[right]);
		right--;
		left++;
	}
	else if(sum>target) {
		right--;
	}
	else {
		left++;
	}
	}
		

	}}
