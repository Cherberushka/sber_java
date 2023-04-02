package lr2.Example10;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Бобик", 3, "Овчарка");
        Cat myCat = new Cat("Сильвер", 7, "белый");
        Bird myBird = new Bird("Леха", 1, true);

        // Шаблон (1. Издает звук 2. Программа пишет что это за звук 3. Лтображает уникальную характеристику)

        // Собака
        myDog.makeSound();
        myDog.fetch();
        System.out.println("Порода моей собаки " + myDog.getBreed());

        // Перенос строки
        System.out.println();

        // Кошка
        myCat.makeSound();
        myCat.purr();
        System.out.println("Окрас моей кошки " + myCat.getFurColor());

        // Перенос строки
        System.out.println();

        // Птица
        myBird.makeSound();
        myBird.chirp();
        System.out.println("Моя птица " + (myBird.canFly() ? "может" : "не может") + " летать.");
    }
}
