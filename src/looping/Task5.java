package looping;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int power =1;
        while(b>0){
            power = power* a;
            b--;
        }
        System.out.println("The result is "+power);
    }
}
