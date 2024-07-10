package Day2;

import java.util.Arrays;

public class Try {
    //    Subset of the string
    public static void main(String[] args) {
        String s = "FUN";
        int length = s.length();
        String[] array = new String[(length * (length + 1)) / 2];
        int temp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                array[temp] = s.substring(i, j + 1);
                temp++;
            }
        }
        System.out.println("The array is: "+ Arrays.toString(array));
    }
}
