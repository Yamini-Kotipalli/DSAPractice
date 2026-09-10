package dsa_class2_ARRAYS;

public class dsac2_3arrays_intersection {

    public static void main(String[] args) {

        int arr1[] = {10, 20, 30, 40, 50};

        int arr2[] = {30, 40, 50, 60, 70};

        int arr3[] = {50, 60, 70, 80, 90};

        boolean isprint = false;

        for (int i = 0; i < arr1.length; i++) {

            boolean foundInArr2 = false;

            // Check arr1 element in arr2
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    foundInArr2 = true;
                    break;
                }
            }

            // If found in arr2, check in arr3
            if (foundInArr2) {

                for (int k = 0; k < arr3.length; k++) {

                    if (arr1[i] == arr3[k]) {

                        System.out.println("Element: " + arr1[i]);
                        isprint = true;
                        break;
                    }
                }
            }
        }

        if (!isprint) {
            System.out.println("No common element");
        }
    }
}