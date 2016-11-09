package SecondWeek;

import SecondWeek.Metod.ArrayUtils;

//Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
public class Second9 {
    public static void main(String[] args) {

        int size = 10;

        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * (75 - 25)) + 25;
        }

        int[] mas1 = new int[size];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * (75 - 25)) + 25;
        }

        ArrayUtils.printArr(mas);
        ArrayUtils.printArr(mas1);

        int count = 0;
        int count1 = 0;
        for (int i = 0; i < mas.length; i++) {

            if (mas[i] % 2 == 0) {
                count++;
            }
            if (mas1[i] % 2 == 0) {
                count1++;
            }
        }
        if (count > count1) {
            System.out.println("first array have more even numbers ");
        } else if (count == count1) {
            System.out.println("they have equal even numbers");
        } else {
            System.out.println("second array have more even numbers ");
        }
    }
}