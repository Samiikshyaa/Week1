package Day2;

public class Task16 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Umbrella");
        for (int i = 0; i < str.length(); i++) {
            if(String.valueOf(str.charAt(i)).equals("e")){
                System.out.println("It contains e");
            }
        }
    }
}
