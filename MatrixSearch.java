package activities;

import java.util.Scanner;
public class MatrixSearch {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the element to search for:");
        int searchElement = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == searchElement) {
                    System.out.println("Element found at position (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the matrix.");
        }
        scanner.close();
    }
}

