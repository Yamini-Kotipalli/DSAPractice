interface A{
	void m1();
	public default void Sleeping() {
		System.out.println("Sleeping with dreams......");
	}
}
public class Demo implements A{
	public void m1() {
		System.out.println("Eating in the class...");
	}
	public void sleeping() {
		System.out.println("Sleeping with dreams along with eating......");
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();
		d.sleeping();
		
	}

}
