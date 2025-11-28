class Calc {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

class A {
    void show() { System.out.println("A show"); }
}

class B extends A {
    @Override
    void show() { System.out.println("B show"); }
}

public class Polymorphism {
    public static void main(String[] args) {

        Calc c = new Calc();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2.5, 3.5));

        A obj = new B();
        obj.show();
    }
}
