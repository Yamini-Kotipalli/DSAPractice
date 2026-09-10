//WITHOUT LAMBDA
/*public class MyRunnable implements Runnable{
	public void run() {
		for (int i=0;i<=10;i++) {
			System.out.println("Seetha Thread");
		}
		
	}
	
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
		for (int i=0;i<=10;i++) {
			System.out.println("Rama Thread");
		}
		
	}

}*/

// WITH LAMBDA
public class MyRunnable {
	public static void main(String[] args){
		Runnable r =() ->{
		for (int i=0;i<=10;i++) {
			System.out.println("Seetha Thread");
		}
		};
		
		Thread t = new Thread(r);
		t.start();
		for (int i=0;i<=10;i++) {
			System.out.println("Rama Thread");
		}
		
	}
}

 
