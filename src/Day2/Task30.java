package Day2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Task30 {
//    Write a Java program to count a number of Unicode code points in the specified text range of a String.

    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(String.valueOf(str.codePointAt(0)));
        System.out.println(Arrays.toString(str.getBytes(StandardCharsets.UTF_8)));
    }
}

