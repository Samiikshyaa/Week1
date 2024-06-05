package Conditional;

import java.util.Scanner;

public class Task_i_j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, j=0;
        int[] angles= new int[3];
        System.out.println("Enter the sides of the triangle: ");
        for (int i = 0; i < angles.length; i++) {
            angles[i]= sc.nextInt();
            sum += angles[i];
        }
        if (sum == 180){
            if (angles[j]==angles[j+1] && angles[j]==angles[j+2] && angles[j+1]==angles[j+2]){
                System.out.println("The triangle is equilateral.");
            } else if (angles[j]==angles[j+1] || angles[j]==angles[j+2] || angles[j+1]==angles[j+2]) {
                System.out.println("The triangle is isosceles.");
            }else {
                System.out.println("The triangle is scalene.");
            }
        } else {
            System.out.println("It is not a triangle. ");
        }
    }

}
