package Day2;

public class Task34 {
//    Write a Java program to create a new String object with the contents of a character array.
    public static void main(String[] args) {
        char[] charArray = {'h','e','l','l','o','h','e'};

        String s = new String(charArray);
        System.out.println(s);
//        StringBuffer sb = new StringBuffer();

//        for (char ch : charArray){
//            sb.append(ch);
//        }
//        System.out.println(sb);
    }
}
