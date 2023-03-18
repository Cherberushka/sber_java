package timus.task1293;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите колличество обрабатываемых панелей: ");
        int n = in.nextInt();

        System.out.println("Введите ширину панели в метрах: ");
        float width = in.nextFloat();

        System.out.println("Введите длину панели в метрах: ");
        float height = in.nextFloat();

        if ((1<=width && width<=100) && (1<=height && height<=100)) {
            float square = width * height;
            float weight_s = 2 *(n * square);
            System.out.printf("Для обработки панелей понадобится: %f нанограмм сульфида.", weight_s);
        } else {
            System.out.println("Панель недопустимого размера");
        }
    }
}
