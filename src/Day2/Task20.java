package Day2;

public class Task20 {
//    Write a Java program to create a new string after removing a specified character from a given string except the first and last position.

    public static void main(String[] args) {
        String str = "Hello";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(i == 0 || i == (str.length()-1)){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
