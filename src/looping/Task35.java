package looping;

public class Task35 {
    public static void main(String[] args) {
        int n = 5, times = 1;
            for (int i = 1; i <= n; i++) {
                if(times%2!=0){
                    for (int j = 0; j < times; j++) {
                        System.out.print(i);
                    }
                }
                System.out.println();
                times=times+2;
            }
    }
}
