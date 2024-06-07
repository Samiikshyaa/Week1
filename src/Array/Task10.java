package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.println("Enter 10 numbers: ");
        for (int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your imputs are: ");
        for (int s: arr) {
            System.out.println(s);
        }
    }
}
