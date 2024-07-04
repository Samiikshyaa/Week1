package Day2;

public class Task43 {
    public static void main(String[] args) {
//        Write a Java program to get the canonical representation of the string object.
        String s1 = new String("Hello");
        String s2 = new String("Hello");


        System.out.println("Both the strings have the same reference? "+ (s1==s2));
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        String str1 = s1.intern();
        String str2 = s2.intern();

        System.out.println("Both the strings have the same reference? "+ (str1==str2));
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
