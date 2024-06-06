package looping;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int rem = 0;
        int sum = 0;
        while (num != 0){
            rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        System.out.println("Sum of the digits is = "+sum);
    }
}
