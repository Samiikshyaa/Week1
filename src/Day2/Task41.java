package Day2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Format;
import java.util.Formatter;

public class Task41 {
    //    Write a Java program to create a unique identifier of a given string.
    public static void main(String[] args) {
        String s = "S@mikshya";

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytestring = md.digest(s.getBytes());
            Formatter formatter = new Formatter();
            for (byte b : bytestring) {
                formatter.format("%02x", b);
            }
            String result = formatter.toString();
            System.out.println(result);
            formatter.close();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }
}
