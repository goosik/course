package ThirdWeek;

import SecondWeek.Metod.ArrayUtils;

public class MatrixUtils {
    public static String toString(int[][] mat) {
        if (mat == null) {
            return "wrong argument";
        }
        if (mat.length == 0) {
            return "matrix is empty";
        }

        String matRes = "";

        for (int i = 0; i < mat.length; i++) {
            int[] row = mat[i];
            for (int j = 0; j < row.length; j++) {
                int col = mat[i][j];
                matRes += col + " ";

            }
            matRes += "\n";
        }
        return matRes;
    }

    public static String toStringBollean(boolean[][] mat) {
        if (mat == null) {
            return "wrong argument";
        }
        if (mat.length == 0) {
            return "matrix is empty";
        }

        String matRes = "";

        for (int i = 0; i < mat.length; i++) {
            boolean[] row = mat[i];
            for (int j = 0; j < row.length; j++) {
                boolean col = mat[i][j];
                matRes += col + " ";

            }
            matRes += "\n";
        }
        return matRes;
    }


    public static int[][] genMatrix8(int size) {
        int[][] mat = new int[size][size];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int rand = ArrayUtils.getRandomNumber(100);
                mat[i][j] = rand % 5 == 0 ? (rand % 5) + 8 : rand;

            }
        }

        return mat;
    }

    public static int[][] genMatrix(int size) {
        int[][] mat = new int[size][size];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int rand = ArrayUtils.getRandomNumber(100);
                mat[i][j] = rand;

            }
        }

        return mat;
    }

    public static boolean[][] genMatrixTrue(int size) {
        boolean[][] mat = new boolean[size][size];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    mat[i][j] = true;
                } else {
                    mat[i][j] = false;
                }

            }
        }

        return mat;
    }
}
