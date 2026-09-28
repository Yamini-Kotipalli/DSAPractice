package collectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class Task5 {

	public static void main(String[] args) {
		HashSet<Integer> n=new HashSet<>();
		n.add(10);
		n.add(20);
		n.add(30);
		n.remove(30);
System.out.println(n);
System.out.println(n.contains(30));
Iterator<Integer> it=n.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
	
}
	}

}
