package dsa_class2_ARRAYS;

public class dsac2_left2rotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// left 2 rotations
		
		      // with direct formula
		
//		        int arr[] = {10, 20, 30, 40, 50};
//
//		        int newarr[] = new int[arr.length];
//
//		        int k = 2;
//
//		        for (int i = 0; i < arr.length; i++) {
//
//		            newarr[i] = arr[(i + k) % arr.length];
//
//		        }
//
//		        System.out.println("New array:");
//
//		        for (int i = 0; i < newarr.length; i++) {
//		            System.out.print(newarr[i] + " ");
//		        }
		        
		        
		        // with bruthforce
		        
//		        int arr[] = {10, 20, 30, 40, 50};
//
//		        for (int r = 1; r <= 2; r++) {
//
//		            int first = arr[0];
//
//		            for (int i = 0; i < arr.length - 1; i++) {
//		                arr[i] = arr[i + 1];
//		            }
//
//		            arr[arr.length - 1] = first;
//		        }
//
//		        for (int x : arr) {
//		            System.out.print(x + " ");
//		        }
		
		
		
		
//		| Feature          | Approach 2: Rotate one-by-one | Approach 1: Direct formula         |
//		| ---------------- | ----------------------------- | ---------------------------------- |
//		| Method           | Performs each rotation        | Calculates final position directly |
//		| Code             | Easier to understand          | Slightly harder initially          |
//		| Uses `%`         | ❌ No                          | ✅ Yes                              |
//		| Uses extra array | ❌ No                          | ✅ Yes                              |
//		| For 2 rotations  | Performs 2 rotations          | Directly gets final result         |
//		| Time             | O(n × k)                      | O(n)                               |
//		| Extra Space      | O(1)                          | O(n)                               |
//		| Best for         | Learning the concept          | Efficient direct solution          |

	    }
		

	}


