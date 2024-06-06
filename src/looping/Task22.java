package looping;

import java.util.Scanner;

public class Task22 {

    public static void main(String[] args) {
        int n =0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            n = sc.nextInt();
        }while(n!=0);
    }
}
