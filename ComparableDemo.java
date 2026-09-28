package collectionsList;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int age;
	String name;
	 Student(int age,String name) {
		 this.age=age;
		 this.name=name;
	 }
	 public int compareTo(Student s) {
		 return this.name.compareTo(s.name);
		
	}
	 public String toString() {
		return age+" "+name;
		 
	 }
}
public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(22,"Ramya"));
		students.add(new Student(20,"santhu"));
	
		students.add(new Student(29,"Bhavya"));
		Collections.sort(students);
		System.out.println(students);
	}

}
