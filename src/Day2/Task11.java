package Day2;

import java.util.Arrays;

public class Task11 {

    //    Write a program to take a string input and sort it alphabetically.
    public static void main(String[] args) {
        String[] s = new String[]{"apple", "banana", "orange", "watermelon", "mango", "litchi"};
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i; j++) {
                if (s[j].compareToIgnoreCase(s[j + 1]) > 0) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(s));
    }
}
