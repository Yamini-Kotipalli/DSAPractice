package dsa_class1_ARRAYS;

public class dsac1_7 {
	public static void main(String[] args) {
		// Missing element
		
		
		int[] arr = {1, 2, 3, 5, 6};

        int n = arr.length + 1;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Element = " + missing);
		
		
		
	}

}
