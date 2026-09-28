package arrays_problems;

public class Majority_element {
	public static void main(String args[]) {
		int arr[]= {2,2,1,3,2,2,1,1,2};
		int majorityele=0;
	
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}	
			}
		
			if(count >arr.length/2) {
				majorityele=arr[i];
				break;
				
			}
		}
		System.out.println("Majority Element in array:"+majorityele);
	}

}
