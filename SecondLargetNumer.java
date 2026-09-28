package collectionsList;

import java.util.ArrayList;

public class SecondLargetNumer {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		int first =Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>first) {
				second=first;
				first=list.get(i);
				
			}
			else if(list.get(i)>second&& first!=list.get(i)) {
				second=list.get(i);
			}
			
			
		}
		System.out.println(second);
		System.out.println(first);
		
	}

}
