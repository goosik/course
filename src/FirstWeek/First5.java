package FirstWeek;

import java.util.Scanner;

//Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
public class First5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a + b) <= 19 && (a + b) >= 11 ){
            System.out.println(a + b);
        }
    }
}
