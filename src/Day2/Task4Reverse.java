package Day2;

public class Task4Reverse {
//    Write a program that takes the string input and reverse the string and display it.
    public static void main(String[] args) {
        String s = "apple";
        for(int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
