package helpdesk;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PasswordUtils {


    public static byte[]  genererSel(int length) {

        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[length];
        secureRandom.nextBytes(salt);
        return salt;

    }
    public static byte[] hacher(byte[] motDePasse, byte[] sel){

        try {
                
            
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(motDePasse);
            messageDigest.update(sel);
            byte[] digest = messageDigest.digest();
            return digest;

        } catch (NoSuchAlgorithmException e) {
             System.err.println("L'algorithme SHA-256 n'est pas disponible.");
             throw new  RuntimeException("Impossible", e);
             
        }
        
    }


}




