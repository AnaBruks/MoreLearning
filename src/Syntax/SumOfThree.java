package Syntax;

public class SumOfThree {
    public static void main(String[] args) {
        /*
        Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
максимальной суммой выведите значение суммы и индекс первого элемента тройки.
         */
        int [] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(100+ Math.random()*1000);
        }
        System.out.println(java.util.Arrays.toString(arr));
        int [] sumTempArray = new int[10];
        for (int i = 0; i < 8; i++) {
                sumTempArray[i]= arr[i] + arr[i+1] + arr [i+2];
        }
        System.out.println(java.util.Arrays.toString(sumTempArray));
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (sumTempArray[i]>maxSum) {
                maxSum = sumTempArray[i];
                index = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(index);


    }
}
