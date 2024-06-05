package looping;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int rem =0, rev =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        while(n!=0){
            rem = n % 10;
            rev = (rev*10)+ rem;
            n /= 10;
        }
        System.out.println("The reverse of "+ n +" is: "+rev);
    }
}
