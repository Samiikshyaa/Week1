package looping;

public class Task37 {
    public static void main(String[] args) {
        boolean flag = true;
        int count = 0;
        while(count < 5){
            while(flag){
                System.out.println("Hello, this is while inner loop");
                flag = false;
            }
            count++;
            flag = true;
        }
    }
}
