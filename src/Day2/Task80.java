package Day2;

public class Task80 {
    public static void main(String[] args) {
//        Write a Java program to create a new string from a given string swapping the last two characters of the given string.
//        The length of the given string must be two or more.

        String s = "samikshya";
        if(s.length()>=2){
            String n = s.substring(0,s.length()-2) + s.charAt(s.length()-1) + s.charAt(s.length()-2);
            System.out.println("The new string after swapping the last two characters of the given string: " +n);
        }else {
            System.out.println("The length of the string is not two or more.");
        }

    }
}
