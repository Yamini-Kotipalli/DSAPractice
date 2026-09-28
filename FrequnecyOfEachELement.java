package collectionsList;

import java.util.ArrayList;

public class FrequnecyOfEachELement {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(); 
		list.add(30);
		list.add(40);
		list.add(30);
		list.add(40);
		list.add(10);
		
		boolean exist=false;
		for(int i=0;i<list.size();i++) {
			int count =0;
			for(int j=i;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					count++;
					System.out.print(count);
					exist=true;
				}
			}
		}
				

	}

}
