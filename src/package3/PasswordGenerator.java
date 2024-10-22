package package3;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String OTHER_CHAR = "!@#$%&*()_+-=[]?";

    private static final String PASSWORD_ALLOW = CHAR_LOWER + CHAR_UPPER + NUMBER + OTHER_CHAR;

    public static String generateRandomPassword(int length){
        if (length < 8 || length > 12) throw new IllegalArgumentException("Некорректная длина пароля!");
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randCharAt = secureRandom.nextInt(PASSWORD_ALLOW.length());
            char randChar = PASSWORD_ALLOW.charAt(randCharAt);
            sb.append(randChar);
        }
        return sb.toString();
    }
}
