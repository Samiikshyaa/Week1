package looping;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pc = 0, nc =0, zo =0;
        char flag = 'y';
        do {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            if(num>0){
                pc++;
            } else if (num<0) {
                nc++;
            }else{
                zo++;
            }
            System.out.println("Do you want to enter other numbers? [y/n]");
            flag = sc.next().charAt(0);
        }while(flag == 'y');

        System.out.println("The positive numbers count is: "+pc);
        System.out.println("The negative numbers count is: "+nc);
        System.out.println("The zero numbers count is: "+zo);
    }
}
