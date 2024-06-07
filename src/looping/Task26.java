package looping;

public class Task26 {
    public static void main(String[] args) {
        int scount = 4;
            for (int i = 1; i<=5; i++){
                for (int k = scount; k >= 1 ; k--) {
                    System.out.print(" ");
                }
                scount --;
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
    }
}
