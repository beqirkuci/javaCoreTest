public class NumberBox<T extends Number> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setValue(3.3);
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setValue(10);
        System.out.println(intBox.getValue() + " " + doubleBox.getValue());
    }
}