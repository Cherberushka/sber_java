package lr2.Example10;

class Bird extends Animal {
    private boolean canFly;

    // Наследуемые методы
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    // Метод для щебетания птиц
    public void chirp() {
        System.out.println(getName() + " щебечет.");
    }

    // Метод отображающий способность птицы летать
    public boolean canFly() {
        return canFly;
    }
}
