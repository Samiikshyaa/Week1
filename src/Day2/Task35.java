package Day2;

public class Task35 {
    public static void main(String[] args) {
//        Write a Java program to check whether a given string ends with the contents of another string.
        String fs = "Hello World";
        String s = "world";
        fs = fs.toLowerCase();
        s = s.toLowerCase();
        int a = 0, count = 0;
        for (int i = 0; i < fs.length(); i++) {
            if ((int) fs.charAt(i) == 32) {
                for (int j = i + 1; j < fs.length(); j++) {
                    if (fs.charAt(j) == s.charAt(a)) {
                        count++;
                        a++;
                    }
                }
            }
        }
        if (count == s.length()) {
            System.out.println("The string ends with another string. ");
        } else {
            System.out.println("The string does not end with another string. ");
        }


//        ================OR=============================
        if (fs.endsWith(s)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
