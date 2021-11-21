package genericsMethods;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();


        Cup<String> string = methods.load("test");
        Cup<Integer> integer = methods.load(123);
    }
}
