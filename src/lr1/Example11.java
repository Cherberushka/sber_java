package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n_year = Year.now().getValue();

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите год вашего рождения: ");
        int birth_year = in.nextInt();

        if (n_year < birth_year) {
            System.out.println("Год вашего пождения не может быть больше текущего года");
        } else {

            int age = n_year - birth_year;
            System.out.printf("%s: %d лет/год", name, age);
        }

    }
}
