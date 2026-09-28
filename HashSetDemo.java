package collectionsList;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> num=new HashSet<>();
		System.out.println(num.add(10));
		System.out.println(num.hashCode());
		System.out.println(num.add(50));
		System.out.println(num.hashCode());
	}

}
