package Day2;

public class Task49 {
    public static void main(String[] args) {
//        Write a Java program to check whether a given string starts with the contents of another string.
        String s1 = "life is life so life life";
        String s2 = "lifes";
        if (s1.indexOf(s2) != -1){
            if (s1.indexOf(s2) == 0){
                System.out.println("The "+s1 + " starts with: "+s2);
            }
        }
        System.out.println(s1.indexOf(s2));

    }
}
