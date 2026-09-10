package Arrays.com;

class Bird {
    public void fly() {
        System.out.println("Bird can fly");
    }
}

class GreenParrot extends Bird {
    public void green() {
        System.out.println("Green Parrot");
    }
}

public class RedParrot extends Bird {
	void red() {
        System.out.println("Red Parrot");
    }

    public static void main(String[] args) {
        GreenParrot g = new GreenParrot();
        g.fly();
        g.green();

        RedParrot r = new RedParrot();
        r.fly();
        r.red();
    }

}
