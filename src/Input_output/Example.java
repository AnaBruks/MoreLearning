package Input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws UnsupportedEncodingException {
        File file = new File("C:\\Users\\anast\\Desktop\\цифры.txt"); // 1 2 5 7 0 1 9 5 6 5
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] nums = line.split(" ");
            if (nums.length != 10) throw new IllegalStateException();

            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += Integer.parseInt(nums[i]);
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalStateException ex) {
            System.out.println("Некорректный входной файл");
        }
    }
}
