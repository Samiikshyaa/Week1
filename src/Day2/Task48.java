package Day2;

public class Task48 {
    public static void main(String[] args) {
//        Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
//        Sample string : "The quick brown fox jumps over the lazy dog."
//        In the above string replace all the fox with cat.

        String s = "The quick brown fox jumps over the lazy dog fox.";
        if (s.contains("fox")){
            s = s.replace("fox","cat");
        }
        System.out.println("The new string is: " + s);
    }
}
