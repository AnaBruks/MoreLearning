package Input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Input_output.Person.parseFileToPersonList;

public class People {
    public static void main(String[] args) throws IOException {
        System.out.println(parseFileToStringList());
        System.out.println(parseFileToPersonList());
    }
    public static List<String> parseFileToStringList() {
        List<String> people = new ArrayList<>();
        File file = new File("people");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) <= 0) {
                    throw new IllegalStateException();
                }
                people.add(line);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalStateException ex) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
