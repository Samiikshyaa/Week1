package Day2;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
//        Write a Java program to concatenate a given string with itself a given number of times.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to concatenate");
        int i =0;
        int count = sc.nextInt();

        StringBuffer concat = new StringBuffer();
        StringBuffer sb = new StringBuffer("Hello");
            do {
                concat.append(sb);
                i++;
            }while(i < count);
            System.out.println(concat);
    }
}
