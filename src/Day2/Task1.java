package Day2;

import java.util.Scanner;

public class Task1 {

//    Write a program to take a string input and display its length and last character.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();

        System.out.println(name.length());
        System.out.println(name.charAt(name.length()-1));
    }
}
