package Dsa_practice;

public class ArmStrong {

	public static void main(String[] args) {
		int num=200;
		int org=num;
		int sum=0;
		while(num>0){
			int temp=num%10;
			sum+=temp*temp*temp;
			num=num/10;
		}
		System.out.println(sum);
		if(org==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}

	}

}
