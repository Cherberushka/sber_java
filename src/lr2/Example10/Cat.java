package lr2.Example10;

class Cat extends Animal {
    private String furColor;

    // Наследуемые методы
    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    // Метод для мурлыкания кошки
    public void purr() {
        System.out.println(getName() + " мурлычет.");
    }

    // Метод отображающий окрас кошки
    public String getFurColor() {
        return furColor;
    }
}
