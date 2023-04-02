package lr2.Example6;

public class Test  extends Person {

    public Test(String name, int age, String gender) {
        super(name, age, gender);
    }

    public static void main(String[] args) {
        Person vanya = new Person("Ваня Иванов", 25, "мужской");
        System.out.println("Имя: " + vanya.getName());
        System.out.println("Возраст: " + vanya.getAge());
        System.out.println("Пол: " + vanya.getGender());

        // Перенос строки
        System.out.println();

        vanya.setAge(30);
        System.out.println("Новый возраст: " + vanya.getAge());
    }
}
