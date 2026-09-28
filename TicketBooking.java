package Dsa_practice;

import java.util.Scanner;

public class TicketBooking {

	public static void main(String[] args) {
		Movie obj=new Movie();
		Scanner sc=new Scanner(System.in);
		int price=sc.nextInt();
		obj.setCost(price);
		sc.nextLine();
		String name=sc.nextLine();
		obj.setName(name);
		System.out.println("cost: "+obj.getCost()+" movie name: "+obj.getName());
		sc.close();
	}

}
