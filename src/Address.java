import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Address {
    private String street;
    private String zip;
    private Integer flor;

    List<Integer> list = new ArrayList();
}
