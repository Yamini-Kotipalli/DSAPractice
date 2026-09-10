package dsa_class2_ARRAYS;

public class Ddsac2_freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// find frequency of each element
		
		
		// normal way
//		int arr[] = {1, 2, 2, 3, 1, 1, 1};
//		for (int i = 0; i < arr.length; i++) {
//		    int count = 0;
//		    for (int j = 0; j < arr.length; j++) {
//		        if (arr[i] == arr[j]) {
//		            count++;
//		        }
//		    }
//		    System.out.println(arr[i] + " = " + count);
//		}
		
		
		// with bruthforce
		
//		int arr[] = {1, 2, 2, 3, 1, 1, 1};
//		boolean visited[] = new boolean[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//		    if (visited[i] == true) {
//		        continue;
//		    }
//		    int count = 1;
//		    for (int j = i + 1; j < arr.length; j++) {
//		        if (arr[i] == arr[j]) {
//		            count++;
//		            visited[j] = true;
//		        }
//		    }
//
//		    System.out.println(arr[i] + " = " + count);
//		}
		
		
		
		
		
//		| Point                 | Normal code               | Brute Force + `visited[]`                |
//		| --------------------- | ------------------------- | ---------------------------------------- |
//		| Outer loop            | Every element             | Every element                            |
//		| Inner loop            | Searches entire array     | Searches remaining array                 |
//		| Comparison            | `arr[i] == arr[j]`        | `arr[i] == arr[j]`                       |
//		| `count++`             | ✅                         | ✅                                        |
//		| `visited[]`           | ❌                         | ✅                                        |
//		| Duplicate output      | ❌ Yes                     | ✅ No                                     |
//		| Frequency calculation | ✅ Correct                 | ✅ Correct                                |
//		| Time complexity       | O(n²)                     | O(n²)                                    |
//		| Extra space           | O(1)                      | O(n)                                     |
//		| Main purpose          | Find frequency repeatedly | Find frequency once per distinct element |
//

	}

}
