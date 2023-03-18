package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        int n_year = Year.now().getValue();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();

        int birth_year = n_year - age;

        if (age >= 0) {
            System.out.printf("Вы родились в %d году", birth_year);
        } else {
            System.out.println("Возраст не может быть отрицательным");
        }
    }
}
