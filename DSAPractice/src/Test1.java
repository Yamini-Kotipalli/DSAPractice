interface Mom {
    default void sleep() {
        System.out.println("Sleeping left side");
    }
}

interface Dad {
    default void sleep() {
        System.out.println("Sleeping right side");
    }
}

class Baby implements Dad, Mom {

    public void sleep() {
        System.out.println("I can sleep my own");

        Mom.super.sleep();
        Dad.super.sleep();
    }
}

public class Test1 {
    public static void main(String[] args) {

        Baby b = new Baby();
        b.sleep();
    }
}