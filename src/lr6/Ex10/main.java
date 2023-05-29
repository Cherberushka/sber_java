package lr6.Ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер списка:");
        int size = in.nextInt();

        System.out.println("Введите значение от 0 - 99:");
        int number = in.nextInt();

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до :" + "\n");

        for (int i = 0; i < size; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterLessNumbers(integers, number);

        System.out.println("\n" + "Список чисел больше " + number + ":" + "\n");

        for (Integer i: integersAfter){
            System.out.println(i);
        }

    }

    public static List<Integer> filterLessNumbers(List<Integer> list, int n){
        return list.stream()
                .filter(x -> x <= n)
                .collect(Collectors.toList());
    }
}
