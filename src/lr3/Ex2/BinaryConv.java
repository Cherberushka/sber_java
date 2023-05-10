package lr3.Ex2;

import java.util.Scanner;

public class BinaryConv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите десятичное число: ");
        int decimal = scanner.nextInt();
        scanner.close();

        String binary = decimalToBinary(decimal);
        System.out.println("Двоичным представлением числа " + decimal + " будет " + binary);
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            return decimalToBinary(decimal / 2) + decimal % 2;
        }
    }
}
