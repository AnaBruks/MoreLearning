package Recursion;

public class Rec {
    public static void main(String[] args) {
        int[] num = {1, 4,45,25,100, 25}; // sum=200
        System.out.println(recSum(num, 0));
    }

    public static int recSum(int[] array, int i) {
        if (i == array.length)
            return 0;

        return array[i] + recSum(array, i+1);
        
//        if (array.length == 0)
//            return;
//
//        int sum = 0;
//        sum += array[array.length];
//        System.out.println(sum);
//
//        recSum(int [array.length - 1] array);

    }
}
