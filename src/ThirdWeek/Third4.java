package ThirdWeek;

import SecondWeek.Metod.ArrayUtils;

//Создать массив, который будет состоять из диагонали матрици
//
//        1 3 5
//        4 5 7  -  1 5 6
//        4 5 6
public class Third4 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5}, {4, 5, 7}, {4, 5, 6}};

        int[] arr = new int[3];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                arr[i] = matrix[i][j];
                i++;
            }
        }
        ArrayUtils.printArr(arr);
    }
}
