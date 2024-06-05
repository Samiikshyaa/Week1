package Conditional;

import java.util.Scanner;

public class Task_f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0, y=0;
        System.out.println("Enter the x- coordinate: ");
        x = sc.nextInt();
        System.out.println("Enter the y- coordinate: ");
        y = sc.nextInt();

        if(x>0){
            // first or fourth
            if (y>0){
                System.out.println("It lies in the first quadrant.");
            } else {
                System.out.println("It lies in the fourth quadrant." );
            }
        } else if (x<0) {
            //second or third
            if (y>0){
                System.out.println("It lies in the second quadrant.");
            }else{
                System.out.println("It lies in the third quadrant.");
            }
        }else if (x==0 && y==0){
            System.out.println("It lies in the origin.");
        }

    }
}
