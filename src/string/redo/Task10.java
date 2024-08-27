package string.redo;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        String[] fruits = {"mango","litchi","banana","apple","kiwi"};
        String temp = new String();
        for (int i = 0; i < fruits.length-1; i++) {
            for (int j = 0; j < fruits.length-i-1; j++) {
                if(fruits[j].length()>fruits[j+1].length()){
                    temp = fruits[j];
                    fruits[j] = fruits[j+1];
                    fruits[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(fruits));
//        System.out.println(Array);
    }
}
