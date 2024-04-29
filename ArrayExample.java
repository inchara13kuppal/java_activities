package activities;

public class ArrayExample {
    public static void main(String[] args) {
        int N = 5; 
        int[] arr = new int[N]; 

        for (int i = 0; i < N; i++) {
            arr[i] = i * 10; // Assigning values to the array elements
        }

        System.out.println("Elements of the array:");
        for (int i = 0; i < N; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}

