package looping;

import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

        Random rd = new Random();
        int random = rd.nextInt(1,100);
        System.out.println(random);
        int guess = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess the number between 1 to 100: ");
            guess = sc.nextInt();

            if (guess > random) {
                System.out.println("Too high, try again!");
            } else if (guess < random) {
                System.out.println("Too low, try again! ");
            }

        }while (guess != random);
        System.out.println("Congratulations!!");
    }
}
