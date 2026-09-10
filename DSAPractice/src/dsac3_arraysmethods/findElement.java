package dsac3_arraysmethods;

public class findElement {

	public static void main(String[] args) {
		// Find an element
		
		int arr[] = {1,2,3,18};
		int target = 18;
		int index = -1;
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index =i;
				break;
			}
		}
		System.out.println(index!=-1?"found index "+index:"not found");
		

	}

}
