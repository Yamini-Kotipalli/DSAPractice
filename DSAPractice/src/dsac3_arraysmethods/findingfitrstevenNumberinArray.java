package dsac3_arraysmethods;

public class findingfitrstevenNumberinArray {
	public static void main(String[] args) {int arr[] = {1,2,3,4,5};
	for(int num:arr) {
		if(num%2==0) {
			System.out.println("found even num"+num);
			return;
		}
	}
	System.out.println("no element found");
		
	}

}
