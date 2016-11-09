package SecondWeek;

import SecondWeek.Metod.ArrayUtils;

//Найти среднее арифметическое массива
public class Second6 {
    public static void main(String[] args) {

        int size = 10;
        int range = 10;
        int sum = 0;
        int avg;
        int[] mas = ArrayUtils.generateMas(size, range);

        ArrayUtils.printArr(mas);

        for (int i = 0; i < mas.length ; i++) {
            sum = sum + mas[i] ;
        }
        avg = sum / mas.length;
        System.out.println(avg);
    }
}