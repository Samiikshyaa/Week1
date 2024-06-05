package Conditional;

import java.util.Scanner;

public class Task_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a = sc.nextInt();
        System.out.println("Enter the second integer: ");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("The integers are equal.");
        }
        else{
            System.out.println("The integers are not equal.");
        }
    }
}
