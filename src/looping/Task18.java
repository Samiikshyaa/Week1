package looping;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int mynum = n;
        int rem = 0, reverse = 0;
        while (n!=0){
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }
        if(mynum == reverse){
            System.out.println("The number is palindrome.");
        }else {
            System.out.println("The number is not palindrome.");
        }
    }
}
