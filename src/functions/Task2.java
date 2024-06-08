package functions;

public class Task2 {
    static int getTotal(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        int t = getTotal(3,4);
        System.out.println("The total is: "+t);
    }
}
