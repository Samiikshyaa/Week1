package Day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Task910 {
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

        for(int k=0; k<str.length; k++){
            for(int j=k+1; j<str.length; j++){

            }
        }

        String[] asc = str.clone();
        Arrays.sort(asc, Comparator.comparingInt(String::length));
        System.out.println("Ascending Order");
        System.out.println(Arrays.toString(asc));

        String[] dec = str.clone();
        Arrays.sort(dec, Comparator.comparingInt(String::length).reversed());
        System.out.println("Descending order ");
        System.out.println(Arrays.toString(dec));
    }
}