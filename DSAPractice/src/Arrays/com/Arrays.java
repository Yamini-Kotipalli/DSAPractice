package Arrays.com;



public class Arrays {

	public static void main(String[] args) {
		
		// Array declaration
		int arr[];   
		
		int arr1[] = new int[5];
		for(int i =0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		int arr2[] = new int[5];
		arr2[0] = 10;
		arr2[1] = 15;
		arr2[2] =30;
		arr2[3] =40;
		arr2[4] = 50;
		System.out.println(arr2[3]);
		
		
		int marks[] = {100,200,300,400};
        System.out.println(marks[0]);
        for(int i =0; i<marks.length; i++) {
        	System.out.println("Array Element in index "+i+":" +marks[i]);
        }
		
		

	}

}
