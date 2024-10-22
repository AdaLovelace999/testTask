package package2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Currency dollar = new Dollar();
        Currency euro = new Euro();
        Currency yuan = new Yuan();
        Currency real = new Real();
        Currency dirham = new Dirham();
        List<Currency> money = Arrays.asList(dollar, euro, yuan, real, dirham);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в рублях:");
        if (scanner.hasNextDouble()) {
            double usrInput = scanner.nextDouble();
            for (Currency c : money){
                c.convert(usrInput);
            }
        } else {
            System.out.println("Введенное значение не является числом. Перезапустите программу и попробуйте снова!");
        }
        scanner.close();
    }
}
