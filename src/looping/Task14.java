package looping;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many terms to print? ");
        int n = sc.nextInt();
        int next = 0;
        int fibo1 = 0;
        int fibo2 = 1;
        for(int i = 1; i<= n; i++){
            System.out.println(fibo1);
            next = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = next;
        }
    }
}
