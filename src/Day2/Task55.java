package Day2;

import java.util.ArrayList;
import java.util.List;

public class Task55 {
    public static void main(String[] args) {
//        Write a Java program to find the longest Palindromic Substring within a string.
        String  s = "Hello";
        String a = "";
        List<String> palindromes = new ArrayList<>();
        for(int i = 0; i < s.length(); i++ ){
            for (int j = i; j <= s.length() ; j++) {
                a = (s.substring(i,j));
                System.out.println(a);
                boolean b = palindrome(a);
                if (b == true){
                    palindromes.add(a);
                }
            }
        }
        System.out.println("The longest is: "+ longest(palindromes));
    }

    static boolean palindrome(String s) {
        boolean bool = false;
        StringBuilder reverse = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--){
            reverse.append(s.charAt(i));
        }
        if(s.equals(reverse.toString())){
            bool = true;
        }
        else{
            bool = false;
        }
//        System.out.println(reverse);
        return bool;
    }
    static String longest(List<String> s){
        String longest = "";
        for(String st : s){
            if (st.length() > longest.length()){
                longest = st;
            }
        }
        return longest;
    }

}
