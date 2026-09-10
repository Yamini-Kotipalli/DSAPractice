package dsa_class2_ARRAYS;

public class dsat2_2d_columrowsum {

    public static void main(String[] args) {

        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int allRowSum = 0;
        int allColumnSum = 0;

        // Row sums
        System.out.println("Row sums:");

        for (int i = 0; i < arr.length; i++) {

            int rowSum = 0;

            for (int j = 0; j < arr[i].length; j++) {

                rowSum = rowSum + arr[i][j];
            }

            System.out.println("Row " + (i + 1) + " = " + rowSum);

            allRowSum = allRowSum + rowSum;
        }

        // Column sums
        System.out.println("\nColumn sums:");

        for (int j = 0; j < arr[0].length; j++) {

            int columnSum = 0;

            for (int i = 0; i < arr.length; i++) {

                columnSum = columnSum + arr[i][j];
            }

            System.out.println("Column " + (j + 1) + " = " + columnSum);

            allColumnSum = allColumnSum + columnSum;
        }

        // Total sums
        System.out.println("\nAll rows sum = " + allRowSum);
        System.out.println("All columns sum = " + allColumnSum);
    }
}