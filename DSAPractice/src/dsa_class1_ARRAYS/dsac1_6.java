package dsa_class1_ARRAYS;

public class dsac1_6 {

    public static void main(String[] args) {

        // Majority Element
        // Majority element = element that occurs more than n/2 times

        int arr[] = {1, 2, 3, 1, 2, 1, 1};

        
        //  BRUTE FORCE / NESTED LOOPS
        

        int maj1 = -1;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > arr.length / 2) {
                maj1 = arr[i];
                break;
            }
        }

        System.out.println("Majority Element = " + maj1);


    }

      
}