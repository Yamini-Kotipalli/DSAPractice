package collectionPractice;

import java.util.ArrayList;
import java.util.Collection;

public class Task1 {
public static void main(String[] args) {
	Collection<Integer> c=new ArrayList<>();
	c.add(10);
	c.add(20);
	c.add(30);
	c.add(40);
	c.add(50);
	System.out.println(c);
	System.out.println(c.size());
	Collection<String> n=new ArrayList<>(); 
	n.add("ramya");
	n.add("bhavya");
	n.add("navya");
	n.add("chinni");
	n.add("kavya");
	System.out.println(n);
	System.out.println(n.size());
}
}
