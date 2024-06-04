package Day2;

public class Task15 {
//    Write a program to replace all consonants from the string "Hello, have a good day" with your favourite character.

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, have a good day");
        System.out.println(sb.replace(0, sb.length(), String.valueOf('a')));
    }
}
