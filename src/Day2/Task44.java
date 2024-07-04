package Day2;

import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
//        Write a Java program to get the last index of a string within a string.
        String s = "Hello World";
        String s1 = "Yello mellow Hello jello Hello";
        System.out.println(s.charAt(s.length()-1));

//        Write a Java program to get the length of a given string.
        System.out.println(s.length());

//        Write a Java program to find whether a region in the current string matches a region in another string.
        String sub1 = s.substring(0,4);
        String sub2 = s1.substring(13,17);
        String sub3 = s1.substring(25,29);

        System.out.println(sub1.equals(sub2));
        System.out.println(sub1.equals(sub3));

    }
}
