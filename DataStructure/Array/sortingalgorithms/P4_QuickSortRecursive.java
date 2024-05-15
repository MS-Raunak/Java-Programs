package DataStructure.Array.sortingalgorithms;

import java.util.Arrays;

public class P4_QuickSortRecursive {
    public static void main(String[] args) {
//        int[]arr = {19,8,23,5,9,1};
        int []arr = {9,6,2,12,10,1};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        sort(arr, 0, arr.length-1);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

    private static void sort(int[] arr, int low, int high) {
        if (low<high){
            int pivotIndex = partition(arr,low,high);
            sort(arr, low, pivotIndex-1);
            sort(arr, pivotIndex+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
