package Array;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int sum = 0;
        int[] arr = new int[size];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int s : arr){
            sum += s;
        }
        System.out.println("The sum of the numbers provided is: "+sum);
        System.out.println("The average of the numbers provided is: "+sum/size);
    }
}
