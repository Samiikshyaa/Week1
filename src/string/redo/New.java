package string.redo;

public class New {
    public static void main(String[] args) {
        int salary = 600000;
        double tax = 0.0;
        if (salary <= 500000) {
            tax = (1/100.0)*salary;
        }else if (salary >=500000 && salary<700000) {
            tax = (10/100.0)*salary;
        }
        System.out.println(tax);
    }
}
