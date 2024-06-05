package Conditional;

public class Task_l {
//    Take a string input from the user and display the same string incrementing the ascii value by 1. You should exclude the special characters.

    public static void main(String[] args) {
        String str = "abc$abc";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetterOrDigit(str.charAt(i)) || Character.isWhitespace(str.charAt(i))){
                int value = str.charAt(i);
                value++;
                sb.append((char)value);
            }else{
                sb.append(str.charAt(i));
            }

        }
        System.out.println("Your string is:   "+ str);
        System.out.println("The new string is:    " + sb);
    }
}
