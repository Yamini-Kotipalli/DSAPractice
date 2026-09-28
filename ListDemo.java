package collectionsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> name=new ArrayList<>() ;
		name.add("ramya");
		name.add("chinni");
		name.add("lucky");
		System.out.println(name);
		name.remove("ramya");
		System.out.println(name);
		List<Integer> name1=new ArrayList<>() ;
		name1.add(1);
		name1.add(2);
		name1.add(3);
		name.remove(Integer.valueOf(3));
	int a=	name.indexOf("lucky");
	System.out.println(a);
		System.out.println(name1);
//		toArray
		String[] arr=name.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
	}

}
