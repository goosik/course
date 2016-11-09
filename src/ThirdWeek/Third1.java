package ThirdWeek;

import java.util.Scanner;

//Матрицы генерировать случайными числами и размер матрицы вводит юзер.
//	3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
public class Third1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[][] matr1 = MatrixUtils.genMatrix8(size);
        String res1 = MatrixUtils.toString(matr1);
        System.out.println(res1);


    }
}
