package Arrays.com;

class Animal{
	 public void eat() {
	        System.out.println("Animal eats food");
	    }
	}
class Lion extends Animal{
	public void roar() {
        System.out.println("Lion roars");
    }
	
}
public class Cub  extends Animal {
	 public void play() {
	        System.out.println("Cub is playing");
	    }
	public static void main(String[] args) {
		Lion l = new Lion();
        l.eat();
        l.roar();
        
		Cub cu = new Cub();
		cu.eat();
		cu.play();
		
	}

}
