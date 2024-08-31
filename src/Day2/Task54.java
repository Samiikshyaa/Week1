package Day2;

public class Task54 {
    public static void main(String[] args) {
//        Write a Java program to trim any leading or trailing whitespace from a given string.
        String s = " Samikshya ";
        StringBuilder sb = new StringBuilder();
        System.out.println(s);
        System.out.println(s.length());
        if(Character.isWhitespace(s.charAt(0)) || Character.isWhitespace(s.charAt(s.length()-1))){
            for (int i = 1; i < s.length()-1; i++){
                sb.append(s.charAt(i+1));
            }
        }
        System.out.println(sb.length());
        System.out.println(sb);

        //    oR========================================
        String nex = " Hello World ";
        System.out.println("Before:"+ nex.length());
        nex = nex.trim();
        System.out.println(nex);
        System.out.println(nex.length());
    }
}
