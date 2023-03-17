package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Текущий год: ");
        int n_year = in.nextInt();

        System.out.println("Введите год вашего рождения: ");
        int birth_year = in.nextInt();

        if (n_year > birth_year) {
            int age = n_year - birth_year;
            System.out.printf("В этом году вам исполнится/исполнилось %d лет/год", age);
        } else {
            System.out.println("Год вашего пождения не может быть больше текущего года");
        }
    }
}
