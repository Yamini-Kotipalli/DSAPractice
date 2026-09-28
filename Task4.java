package collectionPractice;

import java.util.ArrayList;

public class Task4 {

	public static void main(String[] args) {
		ArrayList<Integer> num1=new ArrayList<>();
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(40);
		ArrayList<Integer> num2=new ArrayList<>();
		num2.add(40);
		num2.add(50);
		num2.add(60);
		num2.add(70);
		num1.addAll(1,num2);
		System.out.println(num1);
	}

}
