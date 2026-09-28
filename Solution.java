

	import java.util.*;
	class Solution {
	    public void runningSum(int[] nums) {
	        int sum=0;
	        int arr[]=new int[nums.length];
	       for(int i=0;i<nums.length;i++){
	        sum+=nums[i];
	        arr[i]=sum;
	       } 
	       System.out.println(Arrays.toString(arr));
	    }
	    public static void main(String[] args){
	        Solution sc=new Solution();
	        int nums[]= {1,2,3,4};
	        sc.runningSum(nums);
	        
	    }
	}

