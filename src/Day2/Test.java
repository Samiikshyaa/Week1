package Day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "zebra";
        String s1 = "apple" ;
        String[] wlist = new String[2];
        if(s.compareToIgnoreCase(s1)<0){
            wlist[0]=s;
            wlist[1] = s1;
        } else {
            wlist[0] = s1;
            wlist[1] = s;
        }

        System.out.println(Arrays.toString(wlist));
    }
}
