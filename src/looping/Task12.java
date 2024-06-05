package looping;

import java.util.Scanner;

public class Task12 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int greatest =0, smallest = 0;
            char flag = 'y';
            do {
                System.out.println("Enter the number: ");
                int num = sc.nextInt();
                if(num > greatest){
                    greatest = num;
                }
                if (num < greatest){
                    smallest = num;
                }
                System.out.println("Do you want to enter other numbers? [y/n]");
                flag = sc.next().charAt(0);
            }while(flag == 'y');

            System.out.println("The greatest numbers is: "+greatest);
            System.out.println("The smallest numbers is: "+smallest);
        }
    }

