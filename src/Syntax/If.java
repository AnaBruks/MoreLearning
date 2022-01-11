package Syntax;

import java.util.Scanner;
import static java.lang.Math.pow;

public class If {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int numberOfFloors = scanner.nextInt();
//        if (numberOfFloors<=4 && numberOfFloors !=0){
//            System.out.println("Малоэтажный дом");
//        } else if (numberOfFloors>4 && numberOfFloors <=8){
//            System.out.println("Среднеэтажный дом");
//        } else if (numberOfFloors >=9){
//            System.out.println("Многоэтажный дом");
//        } else System.out.println("Ошибка ввода");
//        Scanner scan = new Scanner(System.in);
//        Scanner scan2 =  new Scanner(System.in);
//        System.out.println( "Введите два числа");
//        int a = scan.nextInt();
//        int b = scan2.nextInt();
//        if (a>=b){
//            System.out.println("Error");
//        }
//            for (int i = a; i <= b; i++) {
//                if (a<b && i%5==0 && i%10!=0){
//                System.out.println(i);
//            }
//        }
//        int i = a +1;
//        while (i<=b){
//            if (i%5==0 && i%10!=0)
//                System.out.println(i);
//                i++;
//        }
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        double result =0;
        if (x>=5){
            result = ((pow(x, 2)-10)/(x+7));
        } else if (x>-3 && x<5){
            result = ((x+3)*((pow(x, 2)-2)));
        } else result = 420;

        System.out.println(result);
    }
}
