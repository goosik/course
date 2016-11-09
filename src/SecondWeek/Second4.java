package SecondWeek;

import SecondWeek.Metod.ArrayUtils;

import java.util.Scanner;

//Посчитать сколько цифр(цифра задается пользователем) в массиве
public class Second4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 20;
        int range = 20;
        int choice = sc.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(mas);

        if(choice > 10 || choice < 0){
            System.out.println("must be from 0 to 9");
        }
        int count = 0;
        for(int i =0; i <= mas.length - 1; i++){
            if(mas[i]==choice){
                count++;
            }
        }
        System.out.println(count);
    }
}