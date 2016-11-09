package SecondWeek;

import SecondWeek.Metod.ArrayUtils;

//Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
public class Second7 {
    public static void main(String[] args) {

        int size = 6;
        int range = 10;
        int sum = 0;
        int avg;
        int sum1 = 0;
        int avg1;
        int[] mas = ArrayUtils.generateMas(size, range);

        ArrayUtils.printArr(mas);

        for (int i = 0; i < mas.length / 2; i++) {
            sum = sum + mas[i];
        }
        avg = sum / (mas.length / 2);

        for (int i = (mas.length / 2); i < mas.length; i++) {
            sum1 = sum1 + mas[i];
        }
        avg1 = sum1 / (mas.length / 2);

        if (avg > avg1) {
            System.out.println("first part bigger " + avg);
        } else if (avg == avg1) {
            System.out.println("they equal " + avg);
        } else {
            System.out.println("second part bigger " + avg1);
        }
    }
}