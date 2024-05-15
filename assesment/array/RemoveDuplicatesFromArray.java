package assesment.array;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 1};

        System.out.println("Original Array: " + Arrays.toString(array));

        int[] result = removeDuplicates(array);

        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        int length = array.length;
        int[] uniqueArray = new int[length];
        int j = 0;

        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (array[i] == uniqueArray[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[j++] = array[i];
            }
        }

        // Trim the uniqueArray to remove unused slots
        return Arrays.copyOf(uniqueArray, j);
    }
}

