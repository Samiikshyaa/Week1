package looping;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        StringBuilder ip = new StringBuilder();
        String s = "Start";

        Scanner sc = new Scanner(System.in);
        int count = 0;
        do {
            System.out.println("Enter any text");
            ip.append(sc.next());
            count++;
            System.out.println("Do you want to exit? If yes, type exit. else, press any key");
            s = sc.next();
        }while(!s.equalsIgnoreCase("exit"));
        System.out.println("The number of inputs is: "+count);
    }
}
