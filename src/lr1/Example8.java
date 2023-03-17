package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String day = in.nextLine();

        System.out.println("Введите месяца: ");
        String month = in.nextLine();

        System.out.println("Введите дату: ");
        int date = in.nextInt();

        System.out.printf("%s, %s, %d", day, month, date);
        in.close();
    }
}
