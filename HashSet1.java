package collectionsList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		String name="ramya";
	LinkedHashSet<Character> letter=new LinkedHashSet<>();
	char ch[]=name.toCharArray();
	for(char ch1:ch) {
	letter.add(ch1);	
	}
	System.out.print(letter);
		}

}
