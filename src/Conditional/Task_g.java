package Conditional;

import java.util.Arrays;
import java.util.Scanner;

public class Task_g {
    public static void main(String[] args) {
        int[] marks = new int[5];
        int sum = 0;
        double percent =0, gpa = 0;
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects of the student: ");
        int mark = 0;
        for (int i = 0; i < marks.length ; i++) {
            mark = sc.nextInt();
            if(mark >= 0 && mark <=100){
                marks[i] = mark;
             }
        }
        for (int s: marks) {
            sum += s;
        }
        System.out.println("The total sum is: "+sum);
        percent = (sum/500.0)*100.0;
        System.out.println("Percent= "+percent);
//        gpa = (percent/20.0) -1.0;
//        System.out.println(gpa);
        if(percent>=97 && percent<=100){
            sb.replace(0,sb.length(),"A+");

        } else if (percent>=93 && percent<=96) {
            sb.replace(0,sb.length(),"A");

        } else if (percent>=90 && percent<=92) {
            sb.replace(0,sb.length(),"A-");

        }else if (percent>=87 && percent<=89) {
            sb.replace(0,sb.length(),"B+");

        }else if (percent>=83 && percent<=86) {
            sb.replace(0,sb.length(),"B");

        }else if (percent>=80 && percent<=82) {
            sb.replace(0,sb.length(),"B-");

        }else if (percent>=77 && percent<=79) {
            sb.replace(0,sb.length(),"C+");

        }else if (percent>=73 && percent<=76) {
            sb.replace(0,sb.length(),"C");

        }else if (percent>=70 && percent<=72) {
            sb.replace(0,sb.length(),"C-");

        }else if (percent>=67 && percent<=69) {
            sb.replace(0,sb.length(),"D+");

        }else if (percent>=60 && percent<=66) {
            sb.replace(0,sb.length(),"D");

        }else if (percent>=59) {
            sb.replace(0,sb.length(),"F");

        }

        System.out.println("Grade = "+sb);
    }
}
