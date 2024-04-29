package activities;

import java.util.Arrays;

public class CharacterArrayDescendingOrder {
    public static void main(String[] args) {
        char[] charArray = {'a', 'c', 'b', 'e', 'd'};
        System.out.println("Original Array: " + Arrays.toString(charArray));

        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }

        System.out.println("Array in Descending Order: " + Arrays.toString(charArray));
    }
}
