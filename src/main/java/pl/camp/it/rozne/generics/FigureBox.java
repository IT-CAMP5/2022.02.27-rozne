package pl.camp.it.rozne.generics;

public class FigureBox<T> {
    T value;

    public FigureBox(T value) {
        this.value = value;
    }

    public FigureBox<T> of(T object) {
        return new FigureBox<>(object);
    }

    public FigureBox<T> empty() {
        return new FigureBox<>(null);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
