package Array;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        int[] nums = {-1,2,4,8,5,-3,-8,-9,10,-7};

        int left = 0, right = nums.length-1, temp = 0;

        while(left <= right){
            if(nums[left]>=0 && nums[right]<0){ //left +ve right -ve
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }else if(nums[left]<0 && nums[right]>=0){ //left -ve right +ve
                left++;
                right--;
            }else if (nums[left]<0) {
                left++;
            }
            else if (nums[right]>=0) {
                right--;
            }
        }
        System.out.println("Array is = "+ Arrays.toString(nums));
    }
}
