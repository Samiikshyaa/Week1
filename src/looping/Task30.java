package looping;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        int ip = 1, greatest =0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag){
            System.out.println("Enter the number: ");
            ip = sc.nextInt();
            if(ip>0){
                if(ip>greatest){
                    greatest = ip;
                }
            }else if (ip == 0){
                flag = false;
                System.out.println("The maximum positive numbers entered is: "+greatest);
            }
        }

    }
}
