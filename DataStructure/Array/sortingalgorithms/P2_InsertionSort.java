package DataStructure.Array.sortingalgorithms;

import java.util.Arrays;

public class P2_InsertionSort {
    public static void main(String[] args) {
        int[]arr = {2, 3, 6, 15, 18,16,1};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i=1; i<arr.length; i++){
            int j = i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
