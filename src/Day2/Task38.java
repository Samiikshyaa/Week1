package Day2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task38 {
    public static void main(String[] args) {
//        Write a Java program to print current date and time in the specified format.
//        Sample Output:
//        Current Date and Time :
//        June 19, 2017
//        3:13 pm

        System.out.println("Current Date and Time: ");
        Date d = new Date();
        SimpleDateFormat date = new SimpleDateFormat("MMMM dd, yyyy");
        SimpleDateFormat time = new SimpleDateFormat("h : mm a");

        System.out.println(date.format(d));
        System.out.println(time.format(d));

    }
}
