package Day2;

public class Task36 {
    //    Write a Java program to check whether two String objects contain the same data.
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        if(s1.equals(s2)){
            System.out.println("The string objects are equal.");
        } else{
            System.out.println("The string objects are not equal. ");
        }
    }
}
