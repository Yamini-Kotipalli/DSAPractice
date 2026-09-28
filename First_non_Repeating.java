package hashmap_problems;

import java.util.Map;
import java.util.HashMap;

public class First_non_Repeating {
	public static void main(String args[]) {
	 String s="mom";
	 
	 Map <Character,Integer> map=new HashMap<>();
	 
	 for(char c:s.toCharArray()) {
		
		map.put(c, map.getOrDefault(c,0)+1);
		 
	 }
	 for(int i=0;i<s.length();i++) {
		 if(map.get(s.charAt(i))==1) {
			 System.out.println("index: "+i);
			 return;
		 }
	 }
	 System.out.println("no element");
	 
	}

}