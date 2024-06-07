package looping;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        int n = 2, terms = 0, current = 0, sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        terms = sc.nextInt();

        for (int i = 1; i <= terms ; i++) {
            for (int j = 1; j <=i ; j++) {
                current = current *10 +2;
            }
            sum += current;
            if(i == terms){
                System.out.print(current);
            }else{
                System.out.print(current+ " + ");
            }
            current = 0;
            }
        System.out.println("\nThe sum is : "+ sum);
        }
 }
