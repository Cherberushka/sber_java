package lr6.Ex5;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {


        String string = "Напишите функцию, которая принимает на вход список строк и возвращает новый список" +
                ", содержащий только те строки, которые содержат заданную подстроку.";

        List<String> strings = List.of(string.split(", | и "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings){
            System.out.println(e);
        }


        List<String> stringsAfter = filterInStrings(strings);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter){
            System.out.println(e);
        }

    }

    public static List<String> filterInStrings(List<String> list){
        return list.stream()
                .filter(s -> s.contains("список"))
                .collect(Collectors.toList());
    }
}
