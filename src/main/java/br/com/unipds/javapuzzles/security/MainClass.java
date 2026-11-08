package br.com.unipds.javapuzzles.security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class MainClass {
    public static void main(String[] args) throws Exception{
        String texto = "Hello World!";

        System.out.println("Texto Original: " + texto);

        System.out.println("---> Gerando chave..." );
        SecretKey secretKey = generateKey();

        System.out.println("---> Criptografando..." );
        String textoCriptografado = criptografar(texto, secretKey);
        System.out.println("Texto Criptografado: " + textoCriptografado);

        System.out.println("---> Descriptografando..." );
        String textoDescriptografado = descriptografar(textoCriptografado, secretKey);
        System.out.println("Texto Descriptografado: " + textoDescriptografado);
    }

    public static String criptografar(String textoOriginal, SecretKey chave) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, chave);
        byte[] textoCriptografado = cipher.doFinal(textoOriginal.getBytes());
        return Base64.getEncoder().encodeToString(textoCriptografado);
    }

    public static String descriptografar(String textoCriptografado, SecretKey chave) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, chave);
        byte[] textoDescriptografado = cipher.doFinal(Base64.getDecoder().decode(textoCriptografado.getBytes()));
        return new String(textoDescriptografado);
    }

    private static SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();
        System.out.println("Chave: " + secretKey);

        return secretKey;
    }
}
