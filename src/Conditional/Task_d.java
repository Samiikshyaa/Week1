package Conditional;

import java.util.Scanner;

public class Task_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String citizen = "Nepali";
        int age =18;

        System.out.println("Enter the nationality: ");
        citizen = sc.next();
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        if (citizen.equalsIgnoreCase("Nepali")){
            if (age >= 18){
                System.out.println("The person is eligible to vote.");
            }
            else{
                System.out.println("The person is not eligible to vote. ");
            }
        }else{
            System.out.println("The citizen is not Nepali.");
        }
    }
}
