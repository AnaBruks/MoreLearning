package Syntax;

public class SecondArray {
    public static void main(String[] args) {
        /*
        Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Затем, используя циклы ​for each ​вывести:
- наибольший элемент массива
- наименьший элемент массива
- количество элементов массива, оканчивающихся на 0
- сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.
         */
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = (int) ( Math.random() * 10000 );
        }
        int maxEl = 0;
        for(int element: arr){
            if (element>maxEl)
                maxEl = element;
        }
        int minEl = 10000;
        for (int element: arr){
            if (element<minEl)
                minEl = element;
        }
        int counter =0;
        for (int element: arr){
            if (element%10==0)
                counter++;
        }
        int sum = 0;
        for (int element: arr){
            if (element%10==0){
                sum+=element;
            }
        }
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(maxEl);
        System.out.println(minEl);
        System.out.println(counter);
        System.out.println(sum);
    }
}
