package Dsa_practice;
public class Task {
	public static void main(String[] args) {
		int num=10;
		int org=num;
		int count =0;
		int sum=0;
		int pro=1;
		int first=0;
		int second=1;
		while(num>0) {
			sum+=num%10;
			pro*=num%10;
			num=num/10;
			count++;
		}
		if(sum==pro) {
			System.out.println("Spy num");
		}
		else {
			System.out.println("Not a spy num");
		}
		System.out.println("febino");
		
		for(int i=2;i<10;i++) {
			System.out.println(first);
			int next=first+second;
			first=second;
			second=next;	
		}
System.out.println("the count is"+count);
System.out.println("the sum is"+sum);
int num1=4;
int num2=8;
int gcd=0;
for(int i=1;i<=num1&&i<=num2;i++) {
	if(num1%i==0&&num%i==0) {
		if(i>gcd) {
			gcd=i;
		}
	}
}
System.out.println(gcd);
	}

}
