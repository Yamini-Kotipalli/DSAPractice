package Dsa_practice;

public class MagicNum {

	public static void main(String[] args) {
		int num=145;
		int sum=0;
		while(num>9) {
			sum=0;
			while(num>0) {
				sum+=num%10;
				num=num/10;
			}
			int temp=num;
			
			num=sum;
	
			
			}
		System.out.println(sum);
		if(sum==1) {
			System.out.println("Magic number");
		}
		else {
		System.out.println("not a magic");
	}
	}

}
