package Dsa_practice;

import java.util.Scanner;

public class ModernSwitch {

	public static void main(String[] args) {
		System.out.println("order details");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch (num) {
        case 1 -> System.out.println("briyani- 270");
        case 2 -> System.out.println("pizza-190");
        case 3 -> System.out.println("burger-110");
        case 4 -> System.out.println("dum biryani-350");
        case 5 -> System.out.println("exit");
        default -> System.out.println("Invalid choice");
    }
sc.close();
	}
}


