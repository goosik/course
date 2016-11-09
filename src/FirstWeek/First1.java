package FirstWeek;//Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее

import java.util.Scanner;

public class First1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("first user,please enter the number");
        int first = sc.nextInt();
        System.out.println("second user,please enter the number");
        int second = sc.nextInt();
        System.out.println("third user,please enter the number");
        int third = sc.nextInt();

        if (third < first && first > second) {
            System.out.println("Max - " + first);
        } else if (second < third && third > first) {
            System.out.println("Max - " + third);
        } else if (first < second && second > first) {
            System.out.println("Max - " + first);
        }

        if (third > first && first < second) {
            System.out.println("Min - " + first);
        } else if (second > third && third < first) {
            System.out.println("Min - " + third);
        } else if (first > second && second < first) {
            System.out.println("Min - " + first);
        }

    }
}
