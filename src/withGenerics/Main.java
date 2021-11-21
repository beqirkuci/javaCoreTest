package withGenerics;


public class Main {
    public static void main(String[] args) {
        Liquid liquid =new Liquid();
        liquid.setDesnsiteti(1.02);
        liquid.setVellimi(123.0);


        Coffe coffe = new Coffe();
        coffe.setNgjyra("kafe");
        coffe.setOrigjina("Cuba");

        Cup<Liquid> liquidCup = new Cup<>(liquid);
        Cup<Coffe> coffeCup = new Cup<>(coffe);

        System.out.println(liquidCup);
        System.out.println(coffeCup);


    }
}
