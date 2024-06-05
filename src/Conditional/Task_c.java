package Conditional;

import java.util.Scanner;

public class Task_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if (a<0){
            System.out.println("The number is negative.");
        } else if (a>0) {
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is zero.");
        }
    }
}
