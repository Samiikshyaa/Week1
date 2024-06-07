package looping;

import java.util.Scanner;

public class Task28 {
    static void count(int[] counts, int rem){
        switch (rem){
            case 0:
                counts[0] ++;
                break;
            case 1:
                counts[1] ++;
                break;
            case 2:
                counts[2] ++;
                break;
            case 3:
                counts[3] ++;
                break;
            case 4:
                counts[4] ++;
                break;
            case 5:
                counts[5] ++;
                break;
            case 6:
                counts[6] ++;
                break;
            case 7:
                counts[7] ++;
                break;
            case 8:
                counts[8] ++;
                break;
            case 9:
                counts[9] ++;
                break;
        }
    }
    public static void main(String[] args) {
        int rem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int[] counts = new int[10];
        while (n != 0) {
            rem = n % 10;
            count(counts,rem);
            n /= 10;
        }
        int i = 0;
        for (int s : counts) {
            System.out.println("The frequency of "+i +" is = "+s);
            i++;
        }
    }
}
