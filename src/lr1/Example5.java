package lr1;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Имя: ");
        String name = in.nextLine();

        System.out.println("Введите Возраст: ");
        int age = in.nextInt();

        System.out.println("Введите Рост: ");
        float height = in.nextFloat();

        System.out.printf("Имя: %s Возраст: %d Рост: %.2f \n", name, age, height);
        in.close();
    }
}
