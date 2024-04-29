package activities;

import java.util.Scanner;
public class MatrixExample {
    public static void main(String[] args) {
        int rows = 3, cols = 3; 
        int[][] matrix = new int[rows][cols]; 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The 3x3 matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
}

