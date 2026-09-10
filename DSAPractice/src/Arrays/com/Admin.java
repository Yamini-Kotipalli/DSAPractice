package Arrays.com;

class Guest {
    public void login() {
        System.out.println("Guest can login");
    }
}

class Developer extends Guest {
    public void code() {
        System.out.println("Developer writes code");
    }
}

public class Admin extends Developer {
	 public void manage() {
		 System.out.println("Admin manages the system");
	    }

	    public static void main(String[] args) {
	        Admin a = new Admin();

	        a.login();
	        a.code();
	        a.manage();
	    }	
}
