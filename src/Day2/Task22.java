package Day2;

public class  Task22 {
//    Write a Java program to return a new string using every character of even positions from a given string.
    public static void main(String[] args) {
        String str = "Hello miss Samikshya";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length() ; i++) {
            if(i%2 == 0){
                System.out.println(str.charAt(i));
                sb.append(str.charAt(i));
            }
        }
        System.out.println("Final Result = "+sb);
    }
}
