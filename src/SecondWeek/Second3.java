package SecondWeek;

import SecondWeek.Metod.ArrayUtils;

import java.util.Scanner;

public class Second3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int range = sc.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);
        int[] mas1 = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(mas);
        ArrayUtils.printArr(mas1);
         for(int i = 0;i <= mas.length-1;i++){
            mas1[i] = mas[i];
        }
        ArrayUtils.printArr(mas1);
    }
}
