package FirstWeek;

import java.util.Scanner;

//Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
public class First3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double i = sc.nextDouble();

        if (i >= 0 && i <= 1) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }
}
