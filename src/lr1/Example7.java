package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Имя: ");
        String name = in.nextLine();

        System.out.println("Введите Возраст: ");
        int age = in.nextInt();

        System.out.printf("Имя: %s; Возраст: %d.", name, age);
        in.close();
    }
}
