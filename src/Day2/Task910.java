package Day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Task910 {
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
    }
}
