package customerService;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class Client {
    private String name;
    private LocalDateTime dateTime;
    private String phone;
}
