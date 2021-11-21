package customerService;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        String date = "2021-12-03T10:15:30";
        String date1 = "2021-12-05T10:15:30.";
        String date2 = "2021-12-09T10:15:30.";

        LocalDateTime localDateTime = LocalDateTime.parse(date);
        LocalDateTime localDateTime1 = LocalDateTime.parse(date);
        LocalDateTime localDateTime2 = LocalDateTime.parse(date);

        Client client = new Client("Albert",localDateTime,"068345667");
        Client client1 = new Client("Fredi",localDateTime1,"068345667");
        Client client2 = new Client("Albert",localDateTime2,"068345667");

        List<Client> clientList = Arrays.asList(client, client1, client2);

        FileService fileService = new FileService();
        fileService.writeToFile("client.txt",clientList);

        System.out.println(Client.class.getName());


    }
}
