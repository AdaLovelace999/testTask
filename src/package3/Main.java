package package3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемую длину пароля от 8 до 12 символов:");
        if (scanner.hasNextInt()){
            int usrInput = scanner.nextInt();
            for (int i = 0; i < 10; i++) {
                System.out.println("Пароль : " + PasswordGenerator.generateRandomPassword(usrInput));
            }
        }
        else {
            System.out.println("Введенное значение не является натуральным числом. Перезапустите программу и попробуйте снова!");
        }
        scanner.close();
    }
}
