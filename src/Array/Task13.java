package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13 {
    static void even(int[] nums){
        System.out.println("The even numbers are: ");
        for (int n: nums) {
            if (n%2 == 0){
                System.out.println(n);
            }
        }
    }
    static void odd (int[] nums){
        System.out.println("The odd numbers are: ");
        for (int n: nums) {
            if (n%2 != 0){
                System.out.println(n);
            }
        }
    }
    static int[] prime(int[] nums){
        int count = 0;
        List<Integer> plist = new ArrayList<>();
        System.out.println("The prime numbers are: ");
        for (int n: nums) {
            for (int i = 1; i <= n; i++) {
                if (n%i == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(n);
                plist.add(n);
            }
            count = 0;
        }

        int[] p = new int[plist.size()];
        for (int i = 0; i < p.length; i++) {
            p[i] = plist.get(i);
        }
        return p;
    }

    static int[] primearray(int[] nums){
        int count = 0;
        List<Integer> plist = new ArrayList<>();
        for (int n: nums) {
            for (int i = 1; i <= n; i++) {
                if (n%i == 0){
                    count++;
                }
            }
            if (count == 2){
                plist.add(n);
            }
            count = 0;
        }

        int[] p = new int[plist.size()];
        for (int i = 0; i < p.length; i++) {
            p[i] = plist.get(i);
        }
        return p;
    }
    static void negative(int[] nums){
        System.out.println("The negative numbers are: ");
        for (int n: nums) {
            if (n < 0){
                System.out.println(n);
            }
        }
    }

    static int[] negativearray(int[] nums){
        List<Integer> nlist = new ArrayList<>();
        for (int n: nums) {
            if (n < 0){
                nlist.add(n);
            }
        }
        int[] narr = new int[nlist.size()];
        for (int i = 0; i < nlist.size(); i++) {
            narr[i]= nlist.get(i);
        }

        return narr;
    }

    static void divisible5(int[] nums){
        System.out.println("The numbers exactly divisible by 5 are: ");
        for (int n: nums) {
            if (n % 5 == 0){
                System.out.println(n);
            }
        }
    }

    static void largest(int[] nums){
        int greatest = 0;
        System.out.println("The largest number is: ");
        for (int n: nums) {
            if (n > greatest){
                greatest = n;
            }
        }
        System.out.println(greatest);
    }

    static void secondlargest(int[] nums){
        int greatest = 0, secondlarge = 0;
        System.out.println("The second largest number is: ");
        for (int n: nums) {
            if (n > greatest) {
                secondlarge = greatest;
                greatest = n;
            }
        }
        System.out.println(secondlarge);
    }

    static int sumall(int[] nums){
        int sum = 0;

        for (int n: nums) {
            sum += n;
        }
        return sum;
    }

    static int[] postivearr(int[] nums){
        List<Integer> plist = new ArrayList<>();
        for (int n : nums) {
            if (n > 0) {
                plist.add(n);
            }
        }
        int[] arr = new int[plist.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = plist.get(i);
        }
        return arr;
    }

    static int[] inc10(int[] nums){
        int[] pa = postivearr(nums);
        int inc =0;
            for (int i = 0; i < pa.length; i++) {
                inc = pa[i] + 10;
                pa[i] = inc;
            }
        return pa;
    }

    public static void main(String[] args) {
        int[] nums = {1,-2,3,5,42,6,7,435,12,-1,-7};
        even(nums);
        System.out.println("=============================");
        odd(nums);
        System.out.println("=============================");
        prime(nums);
        System.out.println("=============================");
        negative(nums);
        System.out.println("=============================");
        divisible5(nums);
        System.out.println("=============================");
        largest(nums);
        System.out.println("=============================");
        secondlargest(nums);
        System.out.println("=============================");
        System.out.println("The sum of numbers is: "+ sumall(nums));
        System.out.println("=============================");
        System.out.println("The sum of all prime numbers is: "+ sumall(primearray(nums)));
        System.out.println("=============================");
        int [] na = negativearray(nums);
        System.out.println("The clone of negative array is: "+ Arrays.toString(na));
        System.out.println("=============================");
        System.out.println("The clone of positive array and increment is: "+Arrays.toString(inc10(nums)));

    }
}
