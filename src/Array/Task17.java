package Array;

import java.util.HashMap;
import java.util.Map;

public class Task17 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4,5};

        Map<Integer,Integer> numcount = new HashMap<>();

        for (int a: arr) {
            if (numcount.containsKey(a)){
                numcount.put(a,numcount.get(a) + 1);
            }else {
                numcount.put(a,1);
            }
        }
        for (int c: numcount.keySet()) {
            System.out.println("The occurence of "+c+" = "+numcount.get(c));
        }
    }
}
