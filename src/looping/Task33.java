package looping;

public class Task33 {
    public static void main(String[] args) {
        char ch = '*';
        int n = 5, times = 1, scount = 4;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= scount; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= times; j++) {
                System.out.print(ch);
            }
            times += 2;
            scount --;
            System.out.println();
        }
        scount = 1;
        times = 7;
        for (int i = 1; i<5 ; i++){
            for (int j = 1; j <= scount ; j++) {
                System.out.print(" ");
            }
            scount++;
            for (int k = times; k >= 1 ; k--) {
                System.out.print(ch);
            }
            times = times -2;
            System.out.println();
        }
    }
}
