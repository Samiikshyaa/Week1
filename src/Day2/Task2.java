package Day2;


import java.util.Scanner;

public class Task2 {
//    Write a program to take two string as input and check whether they are equal or not (Try both equals and ignore case)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String a = sc.next();
        System.out.println("Enter the second string: ");
        String b = sc.next();

        //Using equals
        if(a.equals(b)){
            System.out.println("Both the strings are equal" );
        } else{
            System.out.println("The strings are unequal ");
        }

        System.out.println(a==b);//it compares the addresses in the memory

        //      Using compareToIgnorecase
        System.out.println(a.compareToIgnoreCase(b));

        if(a.compareToIgnoreCase(b)==0){
            System.out.println("Both the strings are equal" );
        } else{
            System.out.println("The strings are unequal ");
        }


        //using ignore case
        if(a.equalsIgnoreCase(b)){
            System.out.println("The strings are equal");
        }else{
            System.out.println("The strings are not equal");
        }
    }
}
