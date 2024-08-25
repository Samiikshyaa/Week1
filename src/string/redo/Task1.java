package string.redo;

public class Task1 {
    public static void main(String[] args) {
       String special = "%^&*()”:>? sur$$$tttt@#$%1";
       String pattern = "!@#$";
       int count = 0;
        for (int i = 0; i < special.length(); i++) {
            if(pattern.contains(String.valueOf(special.charAt(i)))){
                count++;
            }
        }
        System.out.println(count);
    }
}
