package Day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Task9_10 {
//    Write a program to take an array of strings and display the length of strings in an array.
    public static void main(String[] args) {
        String[] str = new String[] {"Samikshya","Hello","world", "Animals"};
        int[] a = new int [str.length];
        for (int i= 0; i<str.length; i++){
            System.out.println(str[i]+": "+str[i].length());
            a[i] = str[i].length();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


        String[] asc = str.clone();
        Arrays.sort(asc, Comparator.comparingInt(String::length));
        System.out.println("Ascending Order");
        System.out.println(Arrays.toString(asc));

        String[] dec = str.clone();
        Arrays.sort(dec, Comparator.comparingInt(String::length).reversed());
        System.out.println("Descending order ");
        System.out.println(Arrays.toString(dec));


        String temp = "OK";
        for(String s : str) {
            for (int i = 0; i < str.length - 1; i++) {
                for (int j = 0; j < str.length-i-1; j++) {
                    if (str[j].length() < str[j + 1].length()) {
                        temp = str[j];
                        str[j] = str[j + 1];
                        str[j + 1] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(str));
    }
}
