package Syntax;

public class TwoDimensionArray {
    /*
     Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
матрицы задать i=12, размерность по строкам, j=8 - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
строк несколько, вывести индекс последней из них.
3 2 1 5 7  // сумма - 18
1 2 5 6 2  // сумма - 16
3 4 9 6 4 // сумма - 26

Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
     */
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = (int) ( Math.random() * 50 );
            }
        }
        int maxSum=0;
        int index = 0;
        for (int i = 0; i < 12; i++) {
            int sum =0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+= arr[i][j];
            }
            if (sum>=maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(index);
    }
}
