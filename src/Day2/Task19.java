package Day2;

public class Task19 {
//    Write a Java program to check whether a given string starts with the contents of another string.

    public static void main(String[] args) {
        String mainstr = "life is beautiful";
        String sub = "life";

//        System.out.println(mainstr.indexOf(sub));
        if(mainstr.indexOf(sub) != -1){
            if (mainstr.indexOf(sub)==0){
                System.out.println("The given string starts with "+ sub);
            }
        }else {
            System.out.println("The string "+sub+" does not exist.");
        }
    }
}
