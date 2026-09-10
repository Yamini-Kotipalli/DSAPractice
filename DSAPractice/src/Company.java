interface Employee1{
	void work();
	
	
	//static method
	static void companyName() {
		System.out.println("ABC Company");
	}
}
class Developer implements Employee1.{
	public void work() {
		System.out.println("Handling some bugs");
	}
}
public class Company {

	public static void main(String[] args) {
		Developer d = new Developer();
		d.work();

	}

}
