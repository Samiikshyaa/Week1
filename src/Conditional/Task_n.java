package Conditional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_n {

    static void inputandprint(int count,String options){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(options);
        }
        System.out.println("The result is: "+ sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TYPE the option: ");
        System.out.println("CREATE");
        System.out.println("READ");
        System.out.println("UPDATE");
        System.out.println("DELETE");
        String options =  sc.next();
        String create = "CREATE";
        String read = "READ";
        String update = "UPDATE";
        String delete = "DELETE";

        switch (options){
            case "CREATE":
                System.out.println("Enter the number of times: ");
                int cr = sc.nextInt();
                inputandprint(cr, create);

                break;
            case "READ":
                System.out.println("Enter the number of times: ");
                int rd = sc.nextInt();
                inputandprint(rd, read);
                break;
            case "UPDATE":
                System.out.println("Enter the number of times: ");
                int up = sc.nextInt();
                inputandprint(up, update);
                break;
            case "DELETE":
                System.out.println("Enter the number of times: ");
                int de = sc.nextInt();
                inputandprint(de, delete);
                break;
        }
    }
}
