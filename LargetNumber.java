package collectionsList;

import java.util.ArrayList;

public class LargetNumber {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(50);
		int mx=list.get(0);
		for(int i=1;i<list.size();i++) {
			if(mx<list.get(i)) {
				int temp=mx;
				mx=list.get(i);
				
			}
			
		}
		System.out.println(mx);
	}

}
