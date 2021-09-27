package guru.qa;

public class Main {

    public static void main(String[] args) {
        Cat firstCat = new Cat("Tisha", 3, true);
        Cat secondCat = new Cat("Mila", 5, true);
        Cat thirdCat = new Cat("Mike", 1, false);

        if (Cat.isFluffyCat()) {
            System.out.println("This cat needs to visit a groomer every three months");
        } else {
            System.out.println("This cat needs to visit a groomer every six months");


            Cat[] cats = {firstCat, secondCat, thirdCat};
            for (Cat cat : cats) {

                System.out.println("Cat " + cat.getName() + cat.getAge() + " years old " + cat.isFluffyCat());
            }
        }
    }
}
