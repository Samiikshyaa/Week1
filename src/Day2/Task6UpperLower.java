package Day2;

import java.awt.*;

public class Task6UpperLower {
    public static void main(String[] args) {
        String s = "Hello World";
        int lcount =0, ucount=0;
        for (int i = 0; i<s.length(); i++){
            if (Character.isLowerCase(s.charAt(i))){
                lcount++;
            } else if (Character.isUpperCase(s.charAt(i))) {
                ucount++;
            }

//            Character.is
        }
        System.out.println("Number of uppercases are: "+ucount);
        System.out.println("Number of lowercases are: "+lcount);
    }
}
