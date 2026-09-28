package collectionsList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<String> sub=new ArrayDeque<>();
		sub.add("java");
		sub.add("python");
		System.out.println(sub);
		sub.addFirst("C++");
		sub.addLast("c");
		System.out.println(sub);
		//ArrayDeques as Stack
		sub.push("Spring");
		System.out.println(sub);
		sub.pop();
		System.out.println(sub);
		System.out.println(sub.peek());
		PriorityQueue<Integer> q=new PriorityQueue<>();
		q.offer(10);
		q.offer(50);
		q.offer(20);
		q.offer(40);
		System.out.println(q);
	}

}
