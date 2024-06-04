package Day2;

public class Task18 {
//    Write a Java program to get the last index of a string within a string.

    public static void main(String[] args) {
        String str = "life is beautiful. Go get a life.";
        String sub = "samikshya";
//        str.indexOf
        int index = str.lastIndexOf(sub);
//        System.out.println(str.lastIndexOf(sub));

        if (index != -1){
            System.out.println("The index of the "+sub+ " is "+ index);
        }
        else {
            System.out.println("The substring"+sub + " doesnot exist.");
        }
    }
}
