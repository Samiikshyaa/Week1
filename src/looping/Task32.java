package looping;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        int choice = 0, count =0;
        do {
            System.out.println("1. Continue");
            System.out.println("2. Exit");
            System.out.println("Enter the choice");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            if (choice==1) {
                count++;
            }else if (choice==2){
                System.out.println("The number of times the option 1 is choosen is: "+count);
            }else{
                System.out.println("Invalid option");
            }
        }while(choice == 1 || (!(choice==1||choice==2)));
    }
}
