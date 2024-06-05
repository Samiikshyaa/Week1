package Conditional;

import java.util.Scanner;

public class Task_k {
    static void printing(int from, int to){
        System.out.println("The numbers from "+from+" to "+to + " are: ");
        for (int i = from; i<to; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int fromNumber=0, toNumber=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fromNumber: ");
        fromNumber = sc.nextInt();
        System.out.println("Enter the toNumber:");
        toNumber = sc.nextInt();

        if(fromNumber>=0 && toNumber>=0){
            if(fromNumber < toNumber){
                printing(fromNumber,toNumber);
            } else if (fromNumber > toNumber) {
                int temp = fromNumber;
                fromNumber = toNumber;
                toNumber = temp;
                printing(fromNumber,toNumber);
            } else {
                System.out.println("The fromNumber and toNumber is equal.");
            }
        }

    }

}
