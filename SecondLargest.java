package Dsa_practice;

import java.util.*;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
         int sum=0;
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		/*int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int n : arr) {
			if(n>first) {
				second=first;
				first=n;
			}
			else if(n>second&&n!=first) {
				second=n;
			}
		
		System.out.println(+second);
		*/
		System.out.println(sum);
	}
}
