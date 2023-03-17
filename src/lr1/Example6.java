package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Введите Фамилию: ");
        String l_name = in.nextLine();

        System.out.println("Введите Имя: ");
        String f_name = in.nextLine();


        System.out.println("Введите Отчество: ");
        String m_name = in.nextLine();


        System.out.printf("Hello %s %s %s", l_name, f_name, m_name);
        in.close();
    }
}
