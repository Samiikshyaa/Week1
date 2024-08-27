package string.redo;

public class TestIntern {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
//        System.out.println(s1.intern());
//        System.out.println(s2.intern().hashCode());
        System.out.println(s3.intern());
        System.out.println(s3.hashCode());

    }
}
