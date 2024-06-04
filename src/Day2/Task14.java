package Day2;

public class Task14 {
//    Write a program to find the number of vowels, consonants, digits and white space characters in a string.

    public static void main(String[] args) {
        String s = "Hello #$ \n123 samik$hya";
        int count1 =0, count2 = 0, vowel = 0, cons = 0 ;
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isWhitespace(ch)){
                count1 ++;
            } else if (Character.isDigit(ch)) {
                count2 ++;
            } else if (Character.isLetter(ch)) {
                if (String.valueOf(ch).equalsIgnoreCase("a")||String.valueOf(ch).equalsIgnoreCase("e")||String.valueOf(ch).equalsIgnoreCase("i")||String.valueOf(ch).equalsIgnoreCase("o")||String.valueOf(ch).equalsIgnoreCase("u")){
                    vowel ++;
                }
                else{
                    cons ++;
                }
            }
        }
        System.out.println("The total number of the whitespaces: "+ count1);
        System.out.println("The total number of the digits: "+ count2);
        System.out.println("The total number of the vowels: "+ vowel);
        System.out.println("The total number of the consonants: "+cons);
    }
}
