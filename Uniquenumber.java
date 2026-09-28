package arrays_problems;

public class Uniquenumber {
	

	public static void main(String[] args) {
//1st way
		
		/*int arr[]= {1,2,3,4,5,2,6};
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]&&i!=j) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(arr[i]+" ");
			}
		}
*/
		
//2nd way
		int arr[]= {1,2,3,4,5,2,6};
		for(int i=0;i<arr.length;i++) {
			boolean nrepeating = true;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]&&i!=j) {
					nrepeating=false;
					break;
				}
			}
			if(nrepeating) {
				System.out.print(arr[i]+" ");
			}
		}

		
		
	}



}