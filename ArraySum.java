package activities;

public class ArraySum {
    public static void main(String[] args) {
        int N = 5; 
        int[] arr = {10, 20, 30, 40, 50}; 
        int sum = 0; // Variable to store the sum
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}

