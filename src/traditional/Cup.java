package traditional;

import lombok.ToString;
import traditional.Coffe;

@ToString
public class Cup {

    private Liquid liquid;
    private Coffe coffe;

    public Liquid getLiquid() {
        return liquid;
    }

    public void setLiquid(Liquid liquid) {
        this.liquid = liquid;
    }

    public Coffe getCoffe() {
        return coffe;
    }

    public void setCoffe(Coffe coffe) {
        this.coffe = coffe;
    }

    void drink() {
        System.out.println("Drinking " + liquid);
    }
}
