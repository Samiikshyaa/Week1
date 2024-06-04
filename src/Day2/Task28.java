package Day2;

public class Task28 {
//    Write a Java program to get the character (Unicode code point) at the given index within the String.
    public static void main(String[] args) {
        String str = "Hello";
        int index = 2;

        // with the codePointAt
        int val = str.codePointAt(index);
        System.out.println(val);

        // without the codePointAt
        int ch = str.charAt(2);
        System.out.println(ch);
        }
    }

