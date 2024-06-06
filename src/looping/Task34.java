package looping;

public class Task34 {
    public static void main(String[] args) {
        int n = 5;
        char ch = '*';
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n ; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
