package string.redo;

import java.util.Random;

public class RandomGeneration {

    public static void main(String[] args) {
        Random rd = new Random();
        int min = 20;
        int max = 40;
        int diff = max - min;
        int number = rd.nextInt(diff) + 20;
        System.out.println(number);
    }
}
