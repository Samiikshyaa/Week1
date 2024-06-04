package Day2;

public class Task24 {
//    Write a Java program to test if a given string contains only digits. Return true or false.

    public static void main(String[] args) {
        String str = "238Sam97686";
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {

            if(Character.isLetter(str.charAt(i))){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
