package looping;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int mynum = n;
        int rem =0, greatest =0;

        while (n!=0){
            rem = n % 10;
                if(rem > greatest){
                    greatest = rem ;
                }
            n /= 10;
        }
        System.out.println("The greatest digit in " + mynum + " is: " + greatest);
    }
}
