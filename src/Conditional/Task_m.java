package Conditional;

public class Task_m {
    public static void main(String[] args) {
        String str = "Hello";
        int num = 12;
        boolean flag = false;
        boolean tf = false;

        if (num % 2 ==0){
            System.out.println("The number is exactly divisible by 2");
            tf = true;
        }

        if(str.length()>=5 && str.length()<10){
            System.out.println("The length of the string is between 5 to 10");
            tf = true;
        }

        if(String.valueOf(str.charAt(0)).equalsIgnoreCase("a") || String.valueOf(str.charAt(0)).equalsIgnoreCase("b") || String.valueOf(str.charAt(0)).equalsIgnoreCase("s") || String.valueOf(str.charAt(0)).equalsIgnoreCase("p")){
            System.out.println("The string’s first letter starts from "+str.charAt(0));
            tf =true;
        }
        for (int i = 0; i < str.length(); i++) {
            if(!(String.valueOf(str.charAt(i)).equalsIgnoreCase("x") || String.valueOf(str.charAt(i)).equalsIgnoreCase("y") || String.valueOf(str.charAt(i)).equalsIgnoreCase("z"))){
                flag = true;
            }else {
                flag = false;
                tf = false;
                break;
            }
        }
        if (flag== true){
            tf = true;
            System.out.println("The string doesnot contain any of given characters ‘x’ or ’y’ or’ z’");

        }

        if (num > 2 && num < 4) {
            tf = true;
            System.out.println("The number is between 2 and 4 digits.");
        }

        String num1 = String.valueOf(num);
            if ((int)str.charAt(0)%2 !=0){
                tf = true;
                System.out.println("The number starts with odd digits. ");
            }

        if (tf == true){
            System.out.println("EUREKA");
        }
    }
}
