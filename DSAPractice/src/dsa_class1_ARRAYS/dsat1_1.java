package dsa_class1_ARRAYS;

public class dsat1_1 {
	public static void main(String[] args) {
		
		
		//  1) COMPARING TWO ARRAYS
		
//		int[] a = {1, 2, 3, 4};
//        int[] b = {1, 2, 3, 4};
//        boolean same = true;
//        if (a.length != b.length) {
//            same = false;
//        } else {
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] != b[i]) {
//                    same = false;
//                    break;
//                }
//            }
//        }
//
//        System.out.println("Arrays are equal = " + same);
//		
		
         //  2) MERGE TWO ARRAYS
		
//		    int[] a = {1, 2, 3};
//	        int[] b = {4, 5, 6};
//	        int[] c = new int[a.length + b.length];
//	        for (int i = 0; i < a.length; i++) {
//	            c[i] = a[i];
//	        }
//	        for (int i = 0; i < b.length; i++) {
//	            c[a.length + i] = b[i];
//	        }
//	        for (int i = 0; i < c.length; i++) {
//	            System.out.print(c[i] + " ");
//	        }
		
		
        //   3) find out third largest value
	        
		
//		    int[] arr = {10, 5, 20, 8, 20, 15};
//	        Integer first = null;
//	        Integer second = null;
//	        Integer third = null;
//	        for (int x : arr) {
//	            // Ignore duplicates
//	            if ((first != null && x == first) ||
//	                (second != null && x == second) ||
//	                (third != null && x == third)) {
//	                continue;
//	            }
//	            if (first == null || x > first) {
//	                third = second;
//	                second = first;
//	                first = x;
//	            } else if (second == null || x > second) {
//	                third = second;
//	                second = x;
//	            } else if (third == null || x > third) {
//	                third = x;
//	            }
//	        }
//	        if (third == null) {
//	            System.out.println("Third largest distinct value does not exist");
//	        } else {
//	            System.out.println("Third Largest = " + third);
//	        }
	        
		
		
         // 4) find out unique elements in a given array
		
		
		int[] arr = {1, 2, 2, 3, 4, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
		
	}

}
