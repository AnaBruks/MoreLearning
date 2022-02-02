package Input_output;

import java.io.*;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        File file = new File("D:\\Курсы\\марафонДЖАВА\\День015\\shoes.csv");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();          // 1 line in the text
                String[] row = line.split(";");      // array of data in 1 line
                PrintWriter pw = new PrintWriter("C:\\Users\\anast\\IdeaProjects\\Learning\\result.txt");

                if (Integer.parseInt(row[2]) == 0) {
                    pw.println(row[0] + ", "+ row [1] + ", " + row[2]);
                }
                pw.close();
            }
            scanner.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
