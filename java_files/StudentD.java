class Student {
    String name;
    int age;
    static String college = "Garden City University";

   
    Student() {
        name = "Unknown";
        age = 18;
    }

   
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}

public class StudentD{
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Thirumalesh", 22);

        s1.display();
        System.out.println();
        s2.display();
    }
}
