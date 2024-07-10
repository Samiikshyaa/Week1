package Day2;

public class Task79 {
    public static void main(String[] args) {
//        Write a Java program to append two given strings such that, if the concatenation creates a double character then omit one of the characters.
        String s1 = "apples";
        String s2 = "Syaus";
        if(s1.toLowerCase().charAt(s1.length()-1) == s2.toLowerCase().charAt(0)){
            s1 = s1.substring(0,s1.length()-1);
        }
        String con = s1.concat(s2);
        System.out.println(con);
    }
}
