package collectionsList;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> num=new PriorityQueue<>();
		num.offer(10);
		num.offer(80);
		num.offer(20);
		num.offer(30);
		System.out.println(num);
		
		System.out.println("Highest pirority element: "+num.peek());
//removing the highest priority element
System.out.println(num.poll());
System.out.println(num);
	}

}
