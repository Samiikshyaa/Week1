package looping;

public class Task38 {
    public static void main(String[] args) {
        int times =1;
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= times ; j++) {
                System.out.println("Hello, this is for inner loop");
            }
        }
    }
}
