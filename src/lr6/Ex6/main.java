package lr6.Ex6;

import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер списка:");
        int size = in.nextInt();

        System.out.println("Введите делитель:");
        int divider = in.nextInt();

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до :" + "\n");

        for (int i = 0; i < size; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterDivideWithout(integers, divider);

        System.out.println("\n" + "Список деляшихся на" + divider + ":" + "\n");

        for (Integer i: integersAfter){
            System.out.println(i);
        }

    }

    public static List<Integer> filterDivideWithout(List<Integer> list, int div){
        return list.stream()
                .filter(x -> x % div == 0)
                .collect(Collectors.toList());
    }
}
