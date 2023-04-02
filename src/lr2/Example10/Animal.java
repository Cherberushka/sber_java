package lr2.Example10;

class Animal {
    private String name;
    private int age;

    // Конструктор, позволяющий создавать объекты класса Animal, используя значения радиуса
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод отображающий имя животного
    public String getName() {
        return name;
    }

    // Метод отображающий возраст животного
    public int getAge() {
        return age;
    }

    // Метод отображающий метод для издания звука животного
    public void makeSound() {
        System.out.println("Какой-то животный звук :)");
    }
}
