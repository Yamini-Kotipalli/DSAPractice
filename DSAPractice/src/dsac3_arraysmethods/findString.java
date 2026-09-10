package dsac3_arraysmethods;

public class findString {

	public static void main(String[] args) {
		// finding String
		
		String[] names = {"bahu","bali","deva","sena"};
		String target ="sena";
		
		boolean found = false;
		
		for(String str: names) {
			if(str.equals(target)) {
				found = true;
				break;
			}
		}
		System.out.println(found?"present":"not present");

	}

}
