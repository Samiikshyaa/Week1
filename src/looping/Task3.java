package looping;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int j = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive number to find the multiplication table:");
        int n = sc.nextInt();

        System.out.println("USING FOR LOOP");
        for (int i = 1; i < 11 ; i++) {
            System.out.println(n + " X " + i + " = "+ (n*i));
        }

        System.out.println("USING FOR WHILE");
        while (j<11){
            System.out.println(n + " X " + j + " = "+ (n*j));
            j++;
        }
    }
}
