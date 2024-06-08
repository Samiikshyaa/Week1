package Array;

public class Task19 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int count = 0;
        if ((nums.length)%2== 0){
            System.out.println("The array has pair of numbers ");
        }
        for (int i = 0; i < nums.length; i=i+2) {
            count++;
        }
        System.out.println(count);
    }
}
