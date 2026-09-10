package Arrays.com;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating record objects
        EmployeeDemo emp1 = new EmployeeDemo(101, "Yamini", 50000);
        EmployeeDemo emp2 = new EmployeeDemo(102, "Rahul", 60000);

        // Accessing record values
        System.out.println("========== Employee 1 Details ==========");
        System.out.println("Employee ID   : " + emp1.empid());
        System.out.println("Employee Name : " + emp1.empname());
        System.out.println("Employee Salary : ₹" + emp1.empsal());

        System.out.println();

        System.out.println("========== Employee 2 Details ==========");
        System.out.println("Employee ID   : " + emp2.empid());
        System.out.println("Employee Name : " + emp2.empname());
        System.out.println("Employee Salary : ₹" + emp2.empsal());

        System.out.println();

        // Printing the complete record
        System.out.println("Using toString():");
        System.out.println(emp1);
        System.out.println(emp2);

	}

}
