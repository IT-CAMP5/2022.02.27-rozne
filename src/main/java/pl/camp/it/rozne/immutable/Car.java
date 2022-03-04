package pl.camp.it.rozne.immutable;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final Cat cat;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.cat = new Cat();
    }

    public Car(String brand, String model, int year, Cat cat) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.cat = new Cat(cat.getName(), cat.getRace(), cat.getAge());
    }

    public String getBrand() {
        return brand;
    }

    public Car setBrand(String brand) {
        return new Car(brand, this.model, this.year);
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        return new Car(this.brand, model, this.year);
    }

    public int getYear() {
        return year;
    }

    public Car setYear(int year) {
        return new Car(this.brand, this.model, year);
    }

    /*public Cat getCat() {
        return cat;
    }*/

    public Car setCat(Cat cat) {
        return new Car(this.brand, this.model, this.year, cat);
    }

    public void printCat() {
        System.out.println(this.cat.getName());
        System.out.println(this.cat.getRace());
        System.out.println(this.cat.getAge());
    }
}
