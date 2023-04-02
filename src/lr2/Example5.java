package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Предложите пользователю ввести открытый текст и ключ
        System.out.print("Введите текст для шифрования: ");
        String plaintext = scanner.nextLine();
        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();

        // Зашифруйте открытый текст с помощью шифра Цезаря
        String encryptedText = encrypt(plaintext, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        // Спросите пользователя, хочет ли он выполнить обратное преобразование
        System.out.print("Выполнить обратное преобразование? (y/n): ");
        String choice = scanner.next().toLowerCase();

        if (choice.equals("y")) {
            // Расшифровать зашифрованный текст с помощью обратного шифра Цезаря
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (choice.equals("n")) {
            System.out.println("До свидания!»");
        } else {
            System.out.println("Введите правильный ответ");
        }
        scanner.close();
    }

    // Функция для выполнения шифрования шифром Цезаря открытого текста с использованием заданного ключа
    public static String encrypt(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                encryptedText.append((char) (((ch - base + key) % 26) + base));
            } else {
                encryptedText.append(ch);
            }
        }
        return encryptedText.toString();
    }

    // Функция для выполнения расшифровки шифра Цезаря на зашифрованном тексте с использованием заданного ключа
    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - key);
    }
}
