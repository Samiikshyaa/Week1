package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
//    Write a program to take string input and convert it to uppercase and lowercase with out
//    using the String function. [ USE ASCII Concept ]

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String user = sc.next();
        char lcase = 'c';
        String[] answer = new String[user.length()];

        for (int i = 0; i < user.length(); i++) {
            char ch = user.charAt(i);
            if (ch >= 65 && ch <= 90) {
                int change = ch + 32;
                lcase = (char) change;

            } else if (ch >= 97 && ch <= 122) {
                int change = ch - 32;
                lcase = (char) change;
            }
            answer[i] = String.valueOf(lcase);
        }
        System.out.println(Arrays.toString(answer));

        for (String s: answer){
            System.out.print(s);
        }
//        System.out.println(ch);
    }
}
