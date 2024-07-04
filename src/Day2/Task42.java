package Day2;

public class Task42 {
    //    Write a Java program to get the index of all the characters of the alphabet.
    public static void main(String[] args) {
        String s = "Hello Samikshya!\n@";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                System.out.println("The index of the "+s.charAt(i)+" is: "+i);
            }else {
                continue;
            }
        }

    }
}
