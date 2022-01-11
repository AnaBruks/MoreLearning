package Syntax;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String city = scanner.nextLine();
            if (city.equals("Stop"))
                break;

            switch (city) {
                case "Москва":
                    System.out.println("Россия");
                    break;
                case "Рим":
                    System.out.println("Italy");
                    break;
                case "Ливерпуль":
                    System.out.println("England");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
