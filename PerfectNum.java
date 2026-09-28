package Dsa_practice;

public class PerfectNum {

	public static void main(String[] args) {
		int num=8;
		int sum=0;
		for(int i=1;i<num;i++) {
	       if(num%i==0) {
	    	   sum+=i;
	       }
		}
		System.out.println(sum);
if(num==sum) {
	System.out.println("perfect number");
}
else {
	System.out.println("Not a perfect num");
}
	}

}
