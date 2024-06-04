package Day2;

public class Task29 {
//    Write a Java program to get the character (Unicode code point) before the specified index within the String.
public static void main(String[] args) {
    String str = "Haello";
    int index = 2;

    System.out.println(str.codePointAt(index-1));
}
}
