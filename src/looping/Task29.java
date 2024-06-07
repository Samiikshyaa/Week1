package looping;

public class Task29 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j+"x"+i+"="+(j*i)+" ");
            }
            System.out.println();

        }
    }
}
