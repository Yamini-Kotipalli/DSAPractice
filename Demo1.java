package collectionsList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Demo1 {

	public static void main(String[] args) {
		
	List<String> name=new ArrayList<>();
	name.add("ramya");
	name.add("kavya");
	name.add("chinni");
	name.add("maha");
	name.add(1,"hello");
	name.s
	System.out.println(name);
	name.remove("kavya");
	System.out.println(name);
	System.out.println(name.contains("ramya"));
	System.out.println(name.size());
	Collection<String> name1=new ArrayList<>();
	System.out.println(name1.isEmpty());
	
	System.out.println(name.hashCode());

	}

}
