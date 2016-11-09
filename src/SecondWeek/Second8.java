package SecondWeek;

import SecondWeek.Metod.ArrayUtils;

import java.util.Scanner;

//Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
// который получается в результате суммы arr1[i] + arr2[i]
public class Second8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int range = sc.nextInt();

        int[] arr1 = ArrayUtils.generateMas(size, range);
        int[] arr2 = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(arr1);
        ArrayUtils.printArr(arr2);

        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }
        ArrayUtils.printArr(arr3);
    }
}