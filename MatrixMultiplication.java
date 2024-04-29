package activities;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int n = 3; // Size of the matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        int[][] result = multiplyMatrices(matrix1, matrix2, n);
        System.out.println("Matrix 1:");
        printMatrix(matrix1, n);
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2, n);
        System.out.println("\nResult:");
        printMatrix(result, n);
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int n) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
