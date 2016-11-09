package FirstWeek;

import java.util.Scanner;

//Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления
// (целую часть от деления  и остачу)в другом случае выводим false и показываем результат деления (целую часть от деления
// и остачу)
public class First6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter one more number");
        int b = sc.nextInt();

        if (a > b) {
            if (a % b == 0) {
                System.out.println("true " + (a / b) + " " + (a % b));
            } else {
                System.out.println("false " + (a / b) + " " + (a % b));
            }
        } else if (b > a) {
            if (a % b == 0) {
                System.out.println((a / b) + " " + (a % b));
            } else {
                System.out.println("false " + (b / a) + " " + (b % a));
            }
        }
    }
}
