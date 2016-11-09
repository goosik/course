package FirstWeek;

import java.util.Scanner;

//Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
// Если второе больше, то выводим сумму.
public class First4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if( a >  b){
            System.out.println(a - b);
        } else if(b > a){
            System.out.println(a + b);
        } else{
            System.out.println("This numbers are equal");

        }
    }
}

