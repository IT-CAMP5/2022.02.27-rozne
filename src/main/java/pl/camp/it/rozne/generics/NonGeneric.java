package pl.camp.it.rozne.generics;

public class NonGeneric {
    Object value;

    public NonGeneric(Object value) {
        this.value = value;
    }

    public NonGeneric of(Object s) {
        return new NonGeneric(s);
    }

    public NonGeneric empty() {
        return new NonGeneric(null);
    }

    public boolean isPresent() {
        return this.value != null;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
