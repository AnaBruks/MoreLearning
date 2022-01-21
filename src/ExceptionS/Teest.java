package ExceptionS;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Teest {
    public static void main(String[] args) {
    try {
        readFromFile();
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.print("Done");
    }
    public static void readFromFile() throws IOException {
        System.out.print("Reading line ");
    }
}