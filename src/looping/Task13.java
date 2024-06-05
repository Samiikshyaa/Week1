package looping;

public class Task13 {
    public static void main(String[] args) {
        int rem =0, n=0, arm =0;
        for (int i =1 ; i<500; i++){
            n = i;
            while(n != 0){
                rem = n%10;
                arm = (int) (arm + Math.pow(rem,3));
                n /= 10;
            }
            if (arm == i){
                System.out.println(i);
            }
            arm = 0;
        }
    }
}
