package traditional;

import traditional.Coffe;
import traditional.Cup;

public class Main {
    public static void main(String[] args) {

        Liquid liquid =new Liquid();
        liquid.setDesnsiteti(1.02);
        liquid.setVellimi(123.0);


        Coffe coffe = new Coffe();
        coffe.setNgjyra("kafe");
        coffe.setOrigjina("Cuba");

        Cup liquidCup = new Cup();
        liquidCup.setLiquid(liquid);
        Cup coffeCup = new Cup();

        coffeCup.setCoffe(coffe);
        System.out.println(liquidCup.toString());
        System.out.println(coffeCup.toString());

    }
}
