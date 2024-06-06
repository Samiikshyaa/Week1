package looping;

public class Task21 {
    public static void main(String[] args) {
//        Write a program to print the numbers from 1 to 100 without using any number in the code.
//        B-A = 66-65 = 1
        int start = 'B' - 'A';
        int end = 'd';

        for (int i = start; i <= end; i++) {
            System.out.print(i+ "\t");
        }
    }
}
