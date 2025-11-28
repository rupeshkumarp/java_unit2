class Person {
    public String name = "Thirumalesh";
    private int age = 25;
    protected String city = "Bengaluru";
    String country = "India";

    public void showPublic() {
        System.out.println("Public Name = " + name);
    }

    private void showPrivate() {
        System.out.println("Private Age = " + age);
    }

    public void accessPrivate() {
        showPrivate();
    }
}

public class Access {
    public static void main(String[] args) {
        Person p = new Person();
        p.showPublic();
        p.accessPrivate();
        System.out.println(p.city);
        System.out.println(p.country);
    }
}
