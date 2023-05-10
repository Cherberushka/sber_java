package lr3.Ex5;

import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        // Создайте HashMap для хранения объектов <Integer, String>.
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Заполните HashMap 10 объектами <Integer, String>.
        hashMap.put(1, "Apple");
        hashMap.put(2, "Ball");
        hashMap.put(3, "Cat");
        hashMap.put(4, "Dog");
        hashMap.put(5, "Elephant");
        hashMap.put(6, "Fox");
        hashMap.put(7, "Giraffe");
        hashMap.put(8, "Horse");
        hashMap.put(9, "Iguana");
        hashMap.put(10, "Jaguar");

        // Найти строки с ключом > 5
        System.out.println("Линии с ключом > 5:");
        hashMap.entrySet().stream()
                .filter(entry -> entry.getKey() > 5)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        // Если key = 0, выведите строки, разделенные запятой
        if (hashMap.containsKey(0)) {
            System.out.println("\nСтроки, разделенные запятой:");
            String[] strings = hashMap.get(0).split(",");
            for (String s : strings) {
                System.out.println(s.trim());
            }
        }

        // Перемножить все ключи, где длина строки>5
        int product = 1;
        for (String s : hashMap.values()) {
            if (s.length() > 5) {
                product *= hashMap.keySet().stream()
                        .filter(key -> hashMap.get(key).equals(s))
                        .findFirst().orElse(1);
            }
        }
        System.out.println("\nПроизведение ключей, где длина строки > 5: " + product);
    }
}
