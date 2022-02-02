package Recursion;

public class Rec {
    public static void main(String[] args) {
        int[] num = {1, 4,45,25,100, 25}; // sum=200
        System.out.println(recSum(num, 0));
        System.out.println(count7(12_377_124_77)); //4

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
    public static int count7 (long number){
        if (number == 0) {
            return 0;
        }
        else if (number % 10 == 7)
            return 1 + count7(number / 10);
        else
            return count7(number/10);
    }
}
