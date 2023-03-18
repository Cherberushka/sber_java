package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int f_value = in.nextInt();

        System.out.println("Введите ввторое число:");
        int s_value = in.nextInt();

        System.out.printf("Сумма: %d; Разность: %d.", f_value + s_value,  f_value - s_value);
    }
}
