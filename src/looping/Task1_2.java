package looping;

public class Task1_2 {
    public static void main(String[] args) {
        int count =1;
        int forsum = 0;
        int whilesum = 0;
        System.out.println("USING FOR LOOP");
        for (int i = 1; i < 11 ; i++) {
            System.out.println(i);
            forsum += i;
        }
        System.out.println("USING FOR LOOP, The sum is "+forsum);

        System.out.println("========================================");

        System.out.println("USING WHILE LOOP");
        while(count<11){
            whilesum += count;
            System.out.println(count);
            count++;
        }
        System.out.println("USING WHILE LOOP, The sum is "+whilesum);
    }
}
