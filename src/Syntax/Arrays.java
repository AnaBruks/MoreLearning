package Syntax;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int n = scanner.nextInt();
            if (n>0) {
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = (int) ( Math.random() * 10 );
               }
                System.out.println("Длина массива: " +n);
                System.out.println(java.util.Arrays.toString(arr));
                int moreThanEight = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i]>8){
                        moreThanEight++;
                    }
                }
                System.out.println("Количество чисел больше 8: "+ moreThanEight);
                int equalToOne = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i]==1)
                        equalToOne++;
                }
                System.out.println("Количество чисел равных 1: " + equalToOne);

                int evenNums = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i]%2==0)
                        evenNums++;
                }
                System.out.println("Количество четных чисел: " + evenNums);

                int notEvenNums = n - evenNums;
//                for (int i = 0; i < n; i++) {
//                    if (arr[i]%2!=0)
//                        notEvenNums++;
//                }
                System.out.println("Количество нечетных чисел: " + notEvenNums);

                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum= sum +arr[i];
                }
                System.out.println("Сумма всех элементов массива: " + sum);
            }
        } catch (Exception e){
            System.out.println("Not a number");
        }


    }
}
