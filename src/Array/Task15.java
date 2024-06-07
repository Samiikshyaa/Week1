package Array;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,324,435,345,65,6};
        int[] arr2 = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
                arr2[j] = arr[i];
                j++;
        }
        System.out.println("The reversed array is: "+ Arrays.toString(arr2));
    }

}
