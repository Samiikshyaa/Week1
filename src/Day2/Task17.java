package Day2;

public class Task17 {
//    Write a Java program to count how many times the substring 'life' is present anywhere in a given string. Counting can also happen for the substring 'li?e', any character instead of 'f'.
    static boolean matchpattern(String a){
        if(a.length() != 4){
            return false;
        }
        return a.charAt(0)=='l' && a.charAt(1)=='i' && a.charAt(3)=='e';
    }
    public static void main(String[] args) {
        int count = 0;
        String s = "Life is a li?e. It is a beautiful life! live lire";
        String sub = "life";

        for(int i = 0; i <= s.length()-sub.length(); i++){
//            System.out.println(s.substring(i, i +sub.length()).toLowerCase());
            if(matchpattern(s.substring(i, i +sub.length()).toLowerCase())){
                count ++;
            }
        }

        System.out.println("The count of the life and its variants are: "+ count);

    }
}
