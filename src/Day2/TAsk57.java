package Day2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TAsk57 {
    public static void main(String[] args) {
//      Write a Java program to find the second most frequent character in a given string.
        String string = "Saamikshyaas".toLowerCase();


//        List<Map.Entry<Character, Long>> l = string.chars().mapToObj(y -> (char)y)
//        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//        .entrySet().stream().sorted((s1,s2)->s2.getValue().compareTo(s1.getValue())).collect(Collectors.toList());
//        System.out.println(l.get(1).getKey());

        Map<Character, Integer> characterMap = new LinkedHashMap<>();
        char[] chars = string.toCharArray();
        for (char c : chars) {
            if (characterMap.containsKey(c)) {
                characterMap.put(c, characterMap.get(c) + 1);
            } else {
                characterMap.put(c, 1);
            }
        }


        List<Map.Entry<Character,Integer>> list = new ArrayList<>(characterMap.entrySet());
        Collections.sort(list,(l1, l2)-> l2.getValue().compareTo(l1.getValue()));

        System.out.println("The second most frequent character in the string: "+ string +" is: "+list.get(1).getKey());
    }
}
