package Day2;

public class Task5WhiteSpaceCount {

//    Write a program to find the number of white spaces used in a string.
    public static void main(String[] args) {
        String s = "Hello World ! \n ;";
        int count =0;
//        for (int i = 0; i< s.length(); i++){
//            System.out.println(Character.isWhitespace(s.charAt(i)));
//        }
//        System.out.println("==============");
        for (int i = 0; i< s.length(); i++){
            if(Character.isWhitespace(s.charAt(i))){
                count++;
            }
        }

        System.out.println("The total number of whitespaces are: "+count);

    }
}
