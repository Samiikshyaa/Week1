package Day2;

public class Task37 {
    //    Write a Java program to compare a given string to another string, ignoring case considerations.
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("Hello");

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("The string objects are equal.");
        } else {
            System.out.println("The string objects are not equal. ");
        }
    }
}

