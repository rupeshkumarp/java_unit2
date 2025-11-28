public class Strings {
    public static void main(String[] args) {

        String s = "Garden City University";

        System.out.println("Length: " + s.length());
        System.out.println("Upper: " + s.toUpperCase());
        System.out.println("Lower: " + s.toLowerCase());
        System.out.println("Substring: " + s.substring(0, 6));
        System.out.println("Contains 'Uni': " + s.contains("Uni"));
        System.out.println("Replace: " + s.replace("University", "Dept of AI"));

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Students");
        System.out.println("Builder: " + sb);
    }
}
