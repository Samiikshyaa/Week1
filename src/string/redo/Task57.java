package string.redo;

import java.util.*;

public class Task57 {
    public static void main(String[] args) {
        String s = "Saaamiiikkkshyaaa".toLowerCase();
        int highest = 0;
        Map<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hmap.containsKey(s.charAt(i))) {
                hmap.put(s.charAt(i), hmap.get(s.charAt(i)) + 1);
            } else {
                hmap.put(s.charAt(i), 1);
            }
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hmap.entrySet());
//        list.sort(Map.Entry.comparingByValue());
//        list.stream().forEach(y -> System.out.println(y.getKey()+" = "+y.getValue()));
        System.out.println("======================================");

//        Comparator--> compare, multiple sorting sequence
//        Collections.sort(list,((entry1, entry2) -> Integer.compare(entry2.getValue(),entry1.getValue())));
//        Collections.sort(list,((entry1, entry2) -> Integer.compare(entry2.getValue(),entry1.getValue())));

        list.sort((entry1, entry2) -> Integer.compare(entry2.getValue(),entry1.getValue()));
        System.out.println("Comparator");
        list.stream().forEach(y -> System.out.println(y.getKey()+" = "+y.getValue()));






//        Comparable--> compareTo, single sorting sequence
//        list.sort((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));
        Collections.sort(list,((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())));
        System.out.println("Comparable");
        list.stream().forEach(y -> System.out.println(y.getKey()+" = "+y.getValue()));

    }
}
