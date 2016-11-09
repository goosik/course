package FirstWeek;

import java.util.Scanner;

//Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
public class First2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 7 == 0) {
            System.out.println(number * 2);
        } else {
            System.out.println("this number not divided to 7");
        }
    }
}
