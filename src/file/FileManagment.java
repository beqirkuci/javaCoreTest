package file;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class FileManagment {
    public static void main(String[] args) throws IOException {

        Person person1 = new Person("Person1","Surname1");
        Person person2 = new Person("Person2","Surname2");
        Person person3 = new Person("Person3","Surname3");
        Person person4 = new Person("Person4","Surname4");
        List<Person> list = Arrays.asList(person1, person2, person3, person4);

        BufferedWriter personsText = new BufferedWriter(new FileWriter("persons.txt"));


        for (Person person:list) {
            personsText.append(person.getName()+"  "+person.getSurname()+"\n");
            personsText.flush();
        }
        // read from files
        BufferedReader in = new BufferedReader(new FileReader("persons.txt"));

        String line;
        while ((line = in.readLine()) != null) {

            String[] arr = line.split("  ");

            System.out.println(arr[0] + "      "+ arr[1]);

        }


    }
}
