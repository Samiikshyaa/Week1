package looping;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        char flag = 'y';
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();
            int s = a+b;
            System.out.println("The sum is "+s);
            System.out.println("Do you want to add again? [y/n]");
            flag = sc.next().charAt(0);
        }while (flag == 'y');
    }
}
