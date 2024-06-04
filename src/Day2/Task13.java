package Day2;

import java.lang.module.FindException;

public class Task13 {
//    Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World”.

    public static void main(String[] args) {
        String str = "Hello, World";
        int index =0;
        System.out.println("The first occurence of the \'o\' in the given sentence is: " + str.indexOf('o'));

        for(int i =0; i<str.length(); i++){
            if (String.valueOf(str.charAt(i)).equals("o")) {
                index = i;
            }
        }
        System.out.println("The last occurence of the \'o\' in the given sentence is: " + index);
    }

}
