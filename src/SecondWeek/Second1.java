package SecondWeek;

import SecondWeek.Metod.ArrayUtils;

import java.util.Scanner;

//Найти минимальное и максимальное значения в массиве и вывести их на консоль
public class Second1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int range = sc.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(mas);
        int max = 0;
        int min = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        System.out.println("MAX:" + max);
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println("MIN:" + min);
    }
}
