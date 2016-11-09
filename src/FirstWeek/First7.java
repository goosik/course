package FirstWeek;

import java.util.Scanner;

/*Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
			124    4    -   true
                    1456   567  -   false
                    1      2    -   false
                    18     98   -   true*/
public class First7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


            if ((a % 10) == (b % 10)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

