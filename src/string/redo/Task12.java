package string.redo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task12 {

    public static void main(String[] args) {
//        LocalDateTime datetime= LocalDateTime.now();
        System.out.println("Current Date and Time: ");
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
        System.out.println(date);
        String time = LocalTime.now().format(DateTimeFormatter.ofPattern("hh : mm a"));
        System.out.println(time);

    }
}
