package SecondWeek;

import SecondWeek.Metod.ArrayUtils;

//Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
public class Second5 {

    public static void main(String[] args) {
        int size = 10;
        int range = 100;
        int[] mas = new int[size];
        for (int i = 0; i <= mas.length - 1; i += 2) {
            int random = ArrayUtils.getRandomNumber(range);
            if (random % 2 == 0) {
                mas[i] = random;
            } else {
                mas[i] = random + 1;
            }
        }
        for (int i = 1; i <= mas.length - 1; i += 2) {
            int random = ArrayUtils.getRandomNumber(range);
            if (random % 2 == 0) {
                mas[i] = random + 1;
            } else {
                mas[i] = random;
            }
        }
        ArrayUtils.printArr(mas);
    }
}
