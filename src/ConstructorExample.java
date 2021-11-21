import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ConstructorExample extends BaseClass {
    private String name;
    private String desc;
    private Double amount;
    private String shortDesc;

    private Address address;

    @Override
    public String toString() {
        return "person with name:"+ name + '\'' +

                " and amount: " + amount +
                '}';
    }


}
