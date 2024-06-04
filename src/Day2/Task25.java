package Day2;

public class Task25 {
//    Write a Java program to remove a specified character from a given string.
    public static void main(String[] args) {
        String s = "Hello world";
        StringBuffer str = new StringBuffer();
        char chrtorem = 'H';
//        System.out.println(str.substring(1,3,"app"));
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == chrtorem){
                continue;
            }
            str.append(s.charAt(i));
        }
        System.out.println(str);
    }
}
