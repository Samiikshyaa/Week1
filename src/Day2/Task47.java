package Day2;

import java.util.Scanner;

public class Task47 {
    public static void main(String[] args) {
        String s1 ="Hellow";
        //        Write a Java program to replace a specified character with another character.
        Scanner sc = new Scanner(System.in);
        System.out.println("what do you want to replace?");
        char replacee = sc.next().charAt(0);
        System.out.println("what do you want to replace with?");
        char replacewith = sc.next().charAt(0);

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == replacee) {
                s1 = s1.replace(s1.charAt(i), replacewith);
            }
        }
        System.out.println("The new string is: " + s1);
    }
}
