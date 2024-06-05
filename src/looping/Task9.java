package looping;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(a!=b){
           if(a<b){
               b=b-a;
           } else {
               a=a-b;
           }
        }
        System.out.println("The HCF is "+a);

    }
}
