package looping;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive integer: ");
        int a = sc.nextInt();
        int prime = 0, count=0;

        for (int i = 1; i<a ; i++){
            if (a% i == 0){
                count ++;
            }
        }
        if(count==2){
            System.out.println("The number "+a+ " is primne number.");
        }else {
            System.out.println("The number "+a+ " is not prime number.");
        }
    }
}
