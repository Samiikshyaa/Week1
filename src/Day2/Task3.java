package Day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        String a = "apple";
        String[] arr = new String[a.length()];
        for (int i =0; i<a.length(); i++){
            arr[i] = String.valueOf(a.charAt(i)) ;
        }
        System.out.println(Arrays.toString(arr));
        for (String s: arr) {
            System.out.print(s);
        }
    }
}
