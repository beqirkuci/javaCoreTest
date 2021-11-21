package withGenerics;

import lombok.ToString;

import java.util.List;

@ToString
public class Cup<T> {

    private T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }
}
