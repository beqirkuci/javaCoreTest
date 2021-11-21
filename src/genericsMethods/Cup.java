package genericsMethods;

import lombok.ToString;

@ToString
public class Cup<T> {

    private T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }
}
