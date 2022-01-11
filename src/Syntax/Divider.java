package Syntax;

import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        while(b!=0){
            System.out.println(a/b);
            break;
        }
    }
}
