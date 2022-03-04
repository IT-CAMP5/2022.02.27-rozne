package pl.camp.it.rozne.generics;

public class Pair<T, F> {
    T firstValue;
    F secondValue;

    public Pair(T firstValue, F secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public F getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(F secondValue) {
        this.secondValue = secondValue;
    }
}
