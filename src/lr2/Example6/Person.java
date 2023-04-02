package lr2.Example6;

public class Person {
    private String name;
    private int age;
    private String gender;

    // Конструктор, позволяющий создавать объекты класса Person, используя значения имени, возраста, пола
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Добавим методы get и set для Имени, Возраста, Пола
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}

