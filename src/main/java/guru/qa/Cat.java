package guru.qa;

public class Cat {
    String name;
    int age;
    boolean isFluffyCat;

    public Cat(String name, int age, boolean isFluffyCat) {
        this.name = name;
        this.age = age;
        this.isFluffyCat = isFluffyCat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isFluffyCat() {
        return isFluffyCat;
    }
}

