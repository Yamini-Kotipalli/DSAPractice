package Arrays.com;

class Person {
    public void personDetails() {
        System.out.println("I am a Person");
    }
}

class Employee extends Person {
    public void work() {
        System.out.println("I am an Employee");
    }
}


public class Manager extends Employee {
	 public void manageTeam() {
	        System.out.println("I am a Manager");
	    }

	    public static void main(String[] args) {

	        Manager m = new Manager();

	        m.personDetails();
	        m.work();
	        m.manageTeam();
	    }

}
