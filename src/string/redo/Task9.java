package string.redo;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        String[] array = {"hello","haka","bakayaro"};
        int[] length = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            length[i] = array[i].length();
        }
        System.out.println(Arrays.toString(length));
    }
}
