package Conditional;

import java.util.Scanner;

public class Task_e {
    public static void main(String[] args) {
        // 1ft = 30.48cm
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height in feet: ");
        double height = sc.nextDouble();
        double centiheight = height * 30.48;

        System.out.println("Your height is: "+height + " ft which is " + centiheight+" cm");
        if (centiheight>160){
            System.out.println("You are tall.");
        }else{
            System.out.println("You are short.");
        }
    }
}
