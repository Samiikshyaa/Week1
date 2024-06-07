package Array;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] array = {22,34,56,67,8,9,1,199,0};
        int greatest = 0, smallest = 0;
//        Arrays.sort(array);
//        System.out.println("The smallest number is: "+ array[0]);
//        System.out.println("The largest number is: "+array[array.length-1]);

        for(int i = 0; i < array.length; i++){
            if(array[i] > greatest){
                greatest = array[i];
            }
            if(array[i] < greatest){
                smallest = array[i];
            }
        }
        System.out.println("The greatest number is: "+greatest);
        System.out.println("The smallest number is: "+smallest);
    }
}
