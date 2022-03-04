package pl.camp.it.rozne.immutable;

public class App {
    public static void main(String[] args) {
        String string = "abcd";

        String newString = string.replace("a", "g");

        Cat cat = new Cat("Kitku", "zwykły", 10);
        System.out.println(cat);
        System.out.println(cat.getName());
        cat.setName("Kot");
        System.out.println(cat);
        System.out.println(cat.getName());

        Car car = new Car("Audi", "A5", 2020);
        System.out.println(car);
        System.out.println(car.getModel());
        Car car2 = car.setModel("A8");
        System.out.println(car);
        System.out.println(car.getModel());

        System.out.println(car2);
        System.out.println(car2.getBrand());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

        Cat c = new Cat("Mroczek", "Rasowy", 2);

        Car car3 = new Car("Toyota", "Corolla", 2019, c);

        car3.printCat();
        c.setName("Reksio");

        car3.printCat();
    }
}
