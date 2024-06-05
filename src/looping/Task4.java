package looping;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int count = n;

        while(count > 0){
            fact *=  count;
            count--;
        }
        System.out.println("The factorial of "+n+" is "+fact);
    }
}
