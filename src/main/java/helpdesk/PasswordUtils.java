package helpdesk;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PasswordUtils {


    public static byte[]  genererSel(int length) {

        // cree un generateur aleatoire 
        SecureRandom secureRandom = new SecureRandom();
        // creer un tableau de byte salt de taille lenght
        byte[] salt = new byte[length];
        // le générateur secureRandom remplir le tableau salt avec des données fortement aléatoires, avec la taille entree au debut
        secureRandom.nextBytes(salt);
        return salt;

    }
    public static byte[] hacher(byte[] motDePasse, byte[] sel){

        try {
                
            // Créer un objet MessageDigest avec l'algorithm voulu 
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            //  donner le message ou phrase a hacher au messageDigest
            messageDigest.update(motDePasse);
            messageDigest.update(sel);
            //  executer la fonction de hachage avec .digest()
            byte[] digest = messageDigest.digest();

            return digest;


        } catch (NoSuchAlgorithmException e) {
             System.err.println("L'algorithme SHA-256 n'est pas disponible.");
             throw new  RuntimeException("Impossible", e);
             
        }
        

    }



        


}




