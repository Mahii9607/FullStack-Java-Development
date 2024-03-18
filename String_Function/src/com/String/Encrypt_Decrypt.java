package com.String;

public class Encrypt_Decrypt {
	public static void main(String[] args) {
        String plaintext = "Hello World";
        int shiftKey = 3;

        // Encrypt the plaintext
        String encryptedText = encrypt(plaintext, shiftKey);
        System.out.println("Encrypted Text: " + encryptedText);

        // Decrypt the encrypted text
        String decryptedText = decrypt(encryptedText, shiftKey);
        System.out.println("Decrypted Text: " + decryptedText);
    }

    public static String encrypt(String plaintext, int shiftKey) {
        StringBuilder encryptedText = new StringBuilder();

        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                char shiftedChar = (char) (((c - 'A' + shiftKey) % 26) + 'A'); // for uppercase letters
                encryptedText.append(shiftedChar);
            } else {
                encryptedText.append(c); // keep non-letter characters unchanged
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(String encryptedText, int shiftKey) {
        StringBuilder decryptedText = new StringBuilder();

        for (char c : encryptedText.toCharArray()) {
            if (Character.isLetter(c)) {
                char shiftedChar = (char) (((c - 'A' - shiftKey + 26) % 26) + 'A'); // for uppercase letters
                decryptedText.append(shiftedChar);
            } else {
                decryptedText.append(c); // keep non-letter characters unchanged
            }
        }

        return decryptedText.toString();
    }
}
