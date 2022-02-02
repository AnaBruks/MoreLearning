package Input_output;

import java.io.*;
import java.util.Random;

public class TextWriter {
    public static void main(String[] args) throws IOException {
        OutputStream output = new FileOutputStream("file.txt");
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10);
            output.write(nums[i]);
        }
        output.close();

//      чтение из файла

        InputStream input = new FileInputStream("file.txt");
        for (int i = 0; i < 10; i++) {
            System.out.print(input.read() + " ");
        }
        input.close();
        printSumDigits(new File("file.txt"));
    }

    public static void printSumDigits(File file) throws IOException {
        InputStream inputStream = new FileInputStream(file);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = +inputStream.read();
        }
        System.out.println("\n" + sum + 1);
        inputStream.close();
    }
}

