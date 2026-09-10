package dsa_class2_ARRAYS;

public class dsac2_dup {
	public static void main(String[] args) {
		// duplicate element
		
		// without bruthforce
		
//		int arr[] = {10,20,30,20,40};
//		boolean found = false;
//		for(int i =0;i<arr.length; i++) {
//			for(int j =0; j<arr[i];j++) {
//				if(arr[i] == arr[j]) {
//					System.out.println("duplicate:" +arr[i]);
//					found = true;
//					break;
//				}
//			}
//		}
//		if(!found) {
//			System.out.println("no duplicate element");
//		}
		
		
		
		// with brutforce
		
		
//		int arr[] = {10,20,30,20,40};
//		boolean found = false;
//		for(int i =0;i<arr.length; i++) {
//			for(int j =0; j<arr[i];j++) {
//				if(arr[i] == arr[j]) {
//					System.out.println("duplicate:" +arr[i]);
//					found = true;
//				
//				}
//			}
//		}
//		if(!found) {
//			System.out.println("no duplicate element");
//		}
		
		
		
//		|                 | Normal nested-loop version | Brute-force comparison  |
//		| --------------- | -------------------------- | ----------------------- |
//		| Inner loop      | `j < i`                    | `j = i + 1`             |
//		| Compares with   | Previous elements          | Next elements           |
//		| Example         | `arr[3]` vs `arr[0..2]`    | `arr[1]` vs `arr[2..4]` |
//		| Duplicate found | `20`                       | `20`                    |
//		| Time complexity | O(n²)                      | O(n²)                   |
//		| Extra space     | O(1)                       | O(1)                    |

	}

}
