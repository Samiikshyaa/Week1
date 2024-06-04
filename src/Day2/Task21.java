package Day2;

public class Task21 {
//    Write a Java program to return a string with the characters of the index position 0,1,2, 5,6,7, ... from a given string.

    public static void main(String[] args) {
        String str = "Hello World This is Samikshya on this side";
        StringBuffer sb = new StringBuffer();
        int count =0;
        for (int i = 0; i < str.length(); i++) {
                if (count != 3){
                    count++;
                    System.out.println(str.charAt(i));
                    sb.append(str.charAt(i));
                }else {
                    count =0;
                    i = i+1;
                }
        }
           System.out.println("The actual string is: "+sb);
        }
    }
