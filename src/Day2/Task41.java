package Day2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Task41 {
//    Write a Java program to create a unique identifier of a given string.
    public static void main(String[] args) {
        String s = "Hello World";
//        System.out.println(s.hashCode());

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytestring = md.digest(s.getBytes());
            System.out.println(bytestring);

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }
}
