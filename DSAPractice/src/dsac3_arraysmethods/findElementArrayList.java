package dsac3_arraysmethods;

import java.util.Arrays;
import java.util.List;



public class findElementArrayList {

	public static void main(String[] args) {
		// finding an element using arraylist
		
		List<String> li = Arrays.asList("pen","paper","book","pencil");
		String target = "book";
		
		List<String> list = null;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(target)) {
				System.out.println("found string"+i);
				return;
			}
		}
		System.out.println("no element found");
		

	}

}
