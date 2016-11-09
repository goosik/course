package ThirdWeek;

import java.util.Scanner;

//Написать метод, который проверяет является ли строка палиндромом
public class Third3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[][] matr1 = MatrixUtils.genMatrix8(size);
        String res1 = MatrixUtils.toString(matr1);
        System.out.println(res1);



    }
}
