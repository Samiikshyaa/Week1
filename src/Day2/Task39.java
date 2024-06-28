package Day2;

import java.util.Arrays;

public class Task39 {
//    Write a Java program to get the contents of a given string as a byte array.
    public static void main(String[] args) {
        String s = "Hello world!";
        byte[] b = new byte[s.length()];

        for (int i = 0; i < s.length(); i++) {
            Byte ch =(byte) s.charAt(i);
            b[i]= ch;
        }

        System.out.println(Arrays.toString(b));

        //or
        byte[] byt = s.getBytes();
        System.out.println(Arrays.toString(byt));
    }
}
