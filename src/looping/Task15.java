package looping;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n =  sc.nextInt();
        double sum=0;
        double first =1;
        System.out.println("The series is: ");
        for(int i = 2 ; i<=n; i++){
            if (first == 1){
                System.out.print((int)first + " + ");
            }
            sum += first;
            first = 1/(double)i;
            if(i==n){
                System.out.print("1/"+i);
            }
            else {
                System.out.print("1/" +i+ " + ");
            }
        }
        System.out.println("\nThe sum is: "+ sum);
    }
}

