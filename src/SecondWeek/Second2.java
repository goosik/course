package SecondWeek;

import SecondWeek.Metod.ArrayUtils;

import java.util.Scanner;

//Найти минимальное и максимальное значения в массиве и вывести их на консоль
public class Second2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int range = sc.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(mas);
        System.out.println(mas[0]+ " "+ mas[mas.length-1]);

        int max = size - 1; //mas.length-1
        int min = 0;
        int tmp = mas[min];

        mas[min] = mas[max];
        mas[max] = tmp;

        ArrayUtils.printArr(mas);
        System.out.println(mas[0]+ " "+ mas[mas.length-1]);
    }
}