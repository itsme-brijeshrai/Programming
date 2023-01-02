import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class AES {
    
    //--------------------------------------------------------------ENCRYPTION--------------------------------------------------------//
    //--------------------------------------------------------------------------------------------------------------------------------//

    private static final String ALGORITHM = "AES";
    private static final byte[] keyValue = "1234567891234567".getBytes();

    private static Key generatKey() throws Exception{
        Key key = new SecretKeySpec(keyValue, ALGORITHM);
        return key;
    }

    public static String encrypt(String valueToEnc, Key key) throws Exception{
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encValue = cipher.doFinal(valueToEnc.getBytes());
        byte[] encryptedByteValue = new Base64().encode(encValue);
        System.out.println("Encrypted Value :: "+new String(encryptedByteValue));
        return new String(encryptedByteValue);
    }

    //-------------------------------------------------------DECRYPTION----------------------------------------------------------------------//
    //--------------------------------------------------------------------------------------------------------------------------------------//

    public static String decrypt(String encryptedValue, Key key) throws Exception {
        // Key key = generateKey();
         Cipher cipher = Cipher.getInstance(ALGORITHM);
         cipher.init(Cipher.DECRYPT_MODE, key);
          
         byte[] decodedBytes = new Base64().decode(encryptedValue.getBytes());
  
         byte[] enctVal = cipher.doFinal(decodedBytes);
         
         System.out.println("Decrypted Value :: " + new String(enctVal));
         return new String(enctVal);
     }

    public static void main(String[] args) throws Exception {
        //Advance Encryption and Decryption of passwords in java
        Key key = generatKey();
        String encryptValue = encrypt("YOUR_SECRET_KEY", key);
        decrypt(encryptValue, key);
    }
}
