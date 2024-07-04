package Day2;

import java.util.Arrays;

public class Task40 {
    //    Write a Java program to get the contents of a given string as a character array.
    public static void main(String[] args) {
        String s = "Hello world!";
        char[] c = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
        }
        System.out.println(Arrays.toString(c));

        // or
        char[] charray = s.toCharArray();
        System.out.println(Arrays.toString(charray));
    }
}

