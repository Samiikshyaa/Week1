package Day2;

public class Task7 {
    public static void main(String[] args) {
        int count = 0;
        String s = "%^&*()”:>? sur$$$tttt@#$%";
        for (int i = 0; i<s.length(); i++){
            if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
