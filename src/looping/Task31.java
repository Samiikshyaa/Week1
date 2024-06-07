package looping;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        int ip = 1, count =0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag){
            System.out.println("Enter the number: ");
            ip = sc.nextInt();
            if(ip>0){
                count++;
            }else{
                flag = false;
                System.out.println("The positive numbers count entered is: "+count);
            }
        }

    }
}
