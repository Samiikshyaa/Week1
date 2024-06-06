package looping;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N: ");
        int n = sc.nextInt();
        int esum =0, osum = 0;
        for (int i = 1; i<= n; i++){
            if (i % 2 == 0){
                esum = esum + i;
            } else {
                osum = osum + i;
            }
        }
        System.out.println(" The sum of the odd numbers in  first "+ n +" natural numbers "+ osum);
        System.out.println(" The sum of the even numbers in first "+ n +" natural numbers "+ esum);
    }
}
