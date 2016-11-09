package FirstWeek;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter time");
        int time = sc.nextInt();

        if (time <= 9 || time >= 18){
            System.out.println("Я отдыхаю");
        } else
            System.out.println("Я на работе");

    }
}
