package com.encryptanddecrypt;



import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class CryptoUtil {

    private static final String ALGO = "AES";
    private static final String SECRET_KEY = "1234567890123456"; // 16 chars

    public static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGO);
        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), ALGO);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public static String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGO);
        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), ALGO);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decoded = Base64.getDecoder().decode(encryptedData);
        return new String(cipher.doFinal(decoded));
    }
}

