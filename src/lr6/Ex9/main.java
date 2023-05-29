package lr6.Ex9;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Привет, мир!", "Java 13", "Этот текст содержит только буквы",
                                                "Hello, world!", "12345", "Only letters here");

        System.out.println("\n" + "Список : " + "\n");
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = filterStrings(strings);

        System.out.println("\n" + "Список после преобразования : " + "\n");
        for (String e : stringsAfter){
            System.out.println(e);
        }

    }

    public static List<String> filterStrings(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("^[a-zA-Z|а-яА-ЯёЁ\\s]*$"))
                .collect(Collectors.toList());
    }
}
