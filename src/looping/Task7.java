package looping;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start of the range: ");
        int a = sc.nextInt();
        System.out.println("Enter the end of the range: ");
        int b =sc.nextInt();

        int esum = 0, osum =0;

        for (int i = a; i <= b; i++) {
            if(i%2 == 0){
                esum = esum + i;
            }
            else{
                osum = osum + i;
            }
        }
        System.out.println("The sum of the even number is: "+ esum);
        System.out.println("The sum of the odd number is: "+ osum);

    }
}
