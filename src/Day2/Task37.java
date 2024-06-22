package Day2;

public class Task37 {
    //    Write a Java program to compare a given string to another string, ignoring case considerations.
    public static void main(String[] args) {
        String s1 = new String("hello").toLowerCase();
        String s2 = new String("Hello").toLowerCase();

        if (s1.equals(s2)) {
            System.out.println("The string objects are equal.");
        } else {
            System.out.println("The string objects are not equal. ");
        }
    }
}

