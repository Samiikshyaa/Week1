package looping;

public class Task25 {
//                   *
//                  **
//                 ***
//                ****
//               *****
    public static void main(String[] args) {
        char ch = '*';
        int count = 0;
        int times = 1;
        for (int i = 1; i<=5; i++){
            for (int j = 4 ; j > count ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print(ch);
            }
            System.out.println();
            times ++;
            count ++;
        }
    }
}
