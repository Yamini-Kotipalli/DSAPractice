package Arrays.com;

class Student {
   public  void study() {
        System.out.println("Student is studying");
    }
}

class College {
    Student s = new Student();   // College HAS-A Student

   public  void display() {
        System.out.println("College has a student");
        s.study();
    }
}
public class University {
	College c = new College();   // University HAS-A College

    public void show() {
        System.out.println("University has a college");
        c.display();
    }

    public static void main(String[] args) {
        University u = new University();
        u.show();
    }

}
