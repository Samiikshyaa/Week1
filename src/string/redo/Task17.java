package string.redo;

public class Task17 {

    public static void main(String[] args) {
        String s = "life is a li?e that li!e.";
        String sub = "life";
        String pattern = new String();
        int count = 0;
        for (int i = 0; i <= s.length() - sub.length(); i++) {
            pattern = (s.substring(i, i + sub.length()).toLowerCase());
//            System.out.println(pattern);
            if (pattern.charAt(0) == 'l' && pattern.charAt(1) == 'i' && pattern.charAt(3) == 'e') {
                count++;
            }
        }
        System.out.println(count);
    }
}
