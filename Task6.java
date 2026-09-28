package collectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task6 {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(40);
		nums.add(20);
		nums.add(30);
		nums.add(43);
		System.out.println(nums.lastIndexOf(40));
		Iterator<Integer> it=nums.iterator();
		while(it.hasNext()) {
			nums.removeIf(n -> n % 2 == 0);
		
		}
	}

}
