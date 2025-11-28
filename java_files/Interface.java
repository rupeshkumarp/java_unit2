interface Movable {
    void move();
}

class Car implements Movable {
    public void move() {
        System.out.println("Car is moving");
    }
}

class Robot implements Movable {
    public void move() {
        System.out.println("Robot is walking");
    }
}

public class Interface {
    public static void main(String[] args) {
        Movable m = new Car();
        m.move();
        m = new Robot();
        m.move();
    }
}
