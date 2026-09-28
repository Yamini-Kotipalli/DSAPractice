package collectionsList;

import java.util.ArrayList;

public class SmallestNumber {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(5);
		list.add(90);
		list.add(1);
		int small=list.get(0);
		for(int i=1;i<list.size();i++) {
			if(small>list.get(i)) {
				int temp=small;
				small=list.get(i);
			}
		}
		
System.out.println(small);
	}

}
