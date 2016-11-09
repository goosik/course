package ThirdWeek;

import java.util.Scanner;

//Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
public class Third2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        boolean[][] matr1 = MatrixUtils.genMatrixTrue(size);
        String res1 = MatrixUtils.toStringBollean(matr1);
        System.out.println(res1);


    }
}
