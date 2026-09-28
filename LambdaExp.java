package collectionPractice;

import java.util.Arrays;

class Solution {
    public void removeDuplicates(int[] nums) {
        
        int[] newArr=new int[nums.length];
        int k=0;
        while(k<nums.length) {
        for(int i=0;i<=k;i++) {
        	if(nums[k]!=newArr[i]) {
        		newArr[i]=nums[k];
        	}
        }
        k++;
    }
        System.out.println(Arrays.toString(newArr));
        
    }
}
public class LambdaExp {

	public static void main(String[] args) {
		
		Solution ob=new Solution();
		int[] arr= {1,2,2,3,4};
		ob.removeDuplicates(arr);
	}

}
