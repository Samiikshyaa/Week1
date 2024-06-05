package Conditional;

import java.util.Scanner;

public class Task_h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);

        if(Character.isLetter(ch)) {
            if (String.valueOf(ch).equalsIgnoreCase("a") || String.valueOf(ch).equalsIgnoreCase("e") || String.valueOf(ch).equalsIgnoreCase("i") || String.valueOf(ch).equalsIgnoreCase("o") || String.valueOf(ch).equalsIgnoreCase("u")) {

                System.out.println("The character is vowel.");
            } else{
                System.out.println("The character \"" + ch +"\" is consonant. ");
            }
        }else {
            System.out.println("The character \"" + ch +"\" is not letter. ");
        }
    }
}
