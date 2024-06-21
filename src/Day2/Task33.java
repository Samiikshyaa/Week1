package Day2;

public class Task33 {
//    Write a Java program to compare a given string to the specified string buffer.

    public static void main(String[] args) {
        String s = "Samikshya";
        StringBuffer sb = new StringBuffer("Samikshya");
        System.out.println(s.equals(sb.toString()));
    }
}
