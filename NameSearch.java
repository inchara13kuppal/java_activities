package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class NameSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        List<String> names = new ArrayList<>();
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }
        System.out.print("Enter the name to search for: ");
        String searchName = scanner.nextLine();
        int index = names.indexOf(searchName);
        if (index == -1) {
            System.out.println("Name not found in the list.");
        } else {
            System.out.println("Name found at index " + index + ".");
        }
        scanner.close();
    }
}


