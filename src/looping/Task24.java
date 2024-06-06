package looping;

public class Task24 {

//    24.WAP to print
//               1
//              222
//             33333
//            4444444
//           555555555

    public static void main(String[] args) {
        int times = 1, scount= 1;

        for (int i = 1; i <= 5 ; i++) {
            if (times % 2 != 0){
                for (int k = 5; k > scount ; k--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= times ; j++) {
                    System.out.print( i );
                }
                System.out.println(" ");
            }
            times += 2;
            scount += 1;
        }
    }
}
