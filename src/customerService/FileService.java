package customerService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileService {
    public void writeToFile(String fileName, List<Client> clients) throws IOException {
        BufferedWriter personsText = new BufferedWriter(new FileWriter(fileName));
        for (Client client : clients) {
            personsText.write(client.getName() + " " + client.getDateTime()
                    + " " + client.getPhone()+"\n");
            personsText.flush();
        }


    }



}
