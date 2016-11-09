package SecondWeek;

import SecondWeek.Metod.ArrayUtils;

//public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end
public class Second10 {

    public static int[] splitArray(int[] arr, int start, int end) {
        int[] arr1 = new int[arr.length - start - (arr.length - end)];
        for (int j = 0; j < arr1.length; j++) {

            for (int i = start; i < end; i++) {
                arr1[j] = arr[i];
                j++;
            }
       }
        return arr1;
    }

    public static void main(String[] args) {

        int size = 10;
        int range = 10;

        int[] arr1 = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(arr1);

        int[] arr2 = splitArray(arr1,2,7);

        ArrayUtils.printArr(arr2);

    }
}