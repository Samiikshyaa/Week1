package Day2;

public class Task31 {
//    Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        boolean flag = true;
//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();

        if(str1.length()==str2.length()){
            flag = check(str1,str2);
            if(flag == true){
                System.out.println("lexicographically equal ");
            } else {
                System.out.println("Not equal lexicographically.");
            }
        }else{
            System.out.println("Not equal length.");
        }
    }


    static boolean check(String s1, String s2){
        boolean flag = true;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)==s2.charAt(i)){
                flag = true;
            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
