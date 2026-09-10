package Arrays.com;
class Engine {
    void start() {
        System.out.println("Engine Started");
    }
}

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}
public class Car extends Vehicle {
	Engine e = new Engine();  // Car HAS-A Engine
	
    void drive() {
        e.start();
        move();
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {
        Car c = new Car();
        
        c.drive();   // Uses Engine
    }
	

}
