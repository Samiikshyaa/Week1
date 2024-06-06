package looping;

public class Task39 {
    public static void main(String[] args) {
        int out= 0, inner = 1;
        do{
          do{
              System.out.println("Hello, this is do while inner loop. ");
              inner++;
          }while(inner == 1);
          out++;
        }while(out!=5);
    }
}
