package Input_output;

import java.io.*;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException, NoSuchElementException {
        File f = new File("C:\\Users\\anast\\Desktop\\файл.txt");
        Scanner scanner = new Scanner(f);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        //String [] words = scanner.nextLine().split(" ");
        //System.out.println(Arrays.toString(words));
        scanner.close();

        FileWriter fw = new FileWriter("test.txt");            // where to write
        FileOutputStream fos1 = new FileOutputStream("test", false);     // предназначен для записи байтов в файл
        //append задает способ записи: eсли он равен true, то данные дозаписываются в конец файла, а при false - файл полностью перезаписывается
        ObjectOutputStream oos = new ObjectOutputStream(fos1);

        fw.write("HUI ");

        //С помощью метода writeTo мы можем вывести массив байт в другой поток.
        // Данный метод в качестве параметра принимает объект OutputStream, в который производится запись массива байт:

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hello Wolrd!";
        byte[] buffer = text.getBytes();
        try{
            baos.write(buffer);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        try(FileOutputStream fos = new FileOutputStream("hello.txt")){   // with resources
            baos.writeTo(fos);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            char[] symbols = {'a', 'b', 'c'};
            OutputStream output = new FileOutputStream("a.txt");
            for (int i = 0; i < symbols.length; i++) {
                // Запись каждого символа в текстовый файл
                output.write(symbols[i]);
            }
            output.close();

            InputStream input = new FileInputStream("a.txt");
            int size = input.available();

            for (int i = 0; i < size; i++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }
            input.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }


    }
}
