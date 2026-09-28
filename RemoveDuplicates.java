package Dsa_practice;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 4};

        int k = removeDuplicates(nums);

        System.out.print("k = " + k + ", nums = [");

        for (int i = 0; i < nums.length; i++) {

            if (i < k) {
                System.out.print(nums[i]);
            } else {
                System.out.print("_");
            }

            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}