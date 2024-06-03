package Day2;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        String[] s = new String[]{"Samikshya","Timalsina","Hello"};
        for (int i = 0; i<s.length; i++) {
            for(int j = i+1; j<s.length; j++){
                if(s[i].compareToIgnoreCase(s[j])>0){
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(s));
    }
}
