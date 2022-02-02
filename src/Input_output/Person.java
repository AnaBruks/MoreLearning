package Input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static List<Person> parseFileToPersonList() {
        List<Person> people = new ArrayList<>();
        File file = new File("people");
        try {
            Scanner scanner = new Scanner(file);
            List<String> lines = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] onePerson = line.split(" ");
                Person person = new Person(onePerson[0], Integer.parseInt(onePerson[1]));

                if (Integer.parseInt(onePerson[1]) <= 0) {
                    throw new IllegalStateException();
                }
                people.add(person);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalStateException ex) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
