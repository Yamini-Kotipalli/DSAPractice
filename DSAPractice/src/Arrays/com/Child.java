package Arrays.com;

class Parent{
	public void m1() {
		System.out.println("Welcome to India");
	}
}

public class Child extends Parent {
	public void m2() {
		System.out.println("I am from the child");
	}
	public static void main(String[] args) {
		Child ch = new Child();
		ch.m1();
		ch.m2();
		
		
	}

}
