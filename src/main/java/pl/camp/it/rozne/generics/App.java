package pl.camp.it.rozne.generics;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        NonGeneric nonGeneric = new NonGeneric(new Triangle());
        Triangle triangle = (Triangle) nonGeneric.getValue();

        FigureBox<Triangle> box = new FigureBox<>(new Triangle());

        Triangle triangle1 = box.getValue();

        FigureBox<Square> box2 = new FigureBox<>(new Square());

        Square square = box2.getValue();

        Pair<String, Integer> pair1 = new Pair<>("jakis", 10);

        Pair<Square, Triangle> pair2 = new Pair<>(new Square(), new Triangle());

        String s = pair1.getFirstValue();
        Integer i = pair1.getSecondValue();

        Square square1 = pair2.getFirstValue();
        Triangle triangle2 = pair2.getSecondValue();

        System.out.println("----------------------------------------------");
        LIFOQueue<Integer> kolejka = new LIFOQueue<>();

        kolejka.push(4);
        System.out.println(kolejka.pop());
        System.out.println(kolejka.pop());

        kolejka.push(5);
        kolejka.push(2);
        kolejka.push(13);

        System.out.println(kolejka.pop());
        System.out.println(kolejka.pop());
        System.out.println(kolejka.pop());

        Pair<List<String>, Map<String, Map<String , String>>> p;

        Triangle t = new Triangle();
        Figure f = new Triangle();

        FigureBox<Triangle> triangleFigureBox = new FigureBox<Triangle>(new Triangle());
        FigureBox<Figure> figureFigureBox = new FigureBox<Figure>(new Figure());

        //FigureBox<Figure> figureFigureBox1 = new FigureBox<Triangle>(new Triangle());

        FigureBox<Car> carFigureBox = new FigureBox<>(new Car());

        FigureBox<Figure> figureBox1 = new FigureBox<>(new Figure());
        metoda1(figureBox1);

        FigureBox<Triangle> figureBox2 = new FigureBox<>(new Triangle());
        metoda1(figureBox2);

        //FigureBox<Car> figureBox3 = new FigureBox<>(new Car());
        //metoda1(figureBox3);

        FigureBox<Figure> figureBox4 = new FigureBox<>(new Figure());
        metoda2(figureBox4);

        FigureBox<Object> figureBox5 = new FigureBox<>(new Object());
        metoda2(figureBox5);
        //metoda1(figureBox5);

        FigureBox<?> figureBox6 = metoda3();

        figureBox6.value = null;
    }

    public static void metoda1(FigureBox<? extends Figure> pudelko) { //UPPER BOUND
        //????
    }

    public static void metoda2(FigureBox<? super Figure> pudelko) { //LOWER BOUND
        //?????
    }

    public static FigureBox<Triangle> metoda3() {
        return new FigureBox<>(new Triangle());
    }
}
