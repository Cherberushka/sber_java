package lr2.Example10;

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Метод для лая собаки
    public void fetch() {
        System.out.println(getName() + " лает.");
    }

    // Метод отображающий окрас собаки
    public String getBreed() {
        return breed;
    }
}
