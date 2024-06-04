package Day2;

public class Task27 {
//    Write a Java program to count occurrences of a certain character in a given string.
    public static void main(String[] args) {
        String str = "Samikshya";
        char ch = 'a';
        int count =0;
        for (int i =0; i<str.length(); i++){
            if (str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("The total number of \'"+ch + "\' in "+str + " is "+count);

    }
}
