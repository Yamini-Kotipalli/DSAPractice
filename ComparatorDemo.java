package collectionsList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1 {
    int age;
    String name;

    Student1(int a, String n) {
        age = a;
        name = n;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }
}

class AgeComparator implements Comparator<Student1> {

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.age - o2.age;
    }
    
}
class NameComparator implements Comparator<Student1> {
    public int compare(Student1 s1, Student1 s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {

        ArrayList<Student1> stud = new ArrayList<>();

        stud.add(new Student1(33, "rahul"));
        stud.add(new Student1(31, "rah"));
        stud.add(new Student1(35, "kaki"));

        Collections.sort(stud, new NameComparator());

        System.out.println(stud);
    }
}