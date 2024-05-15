package DataStructure.Array.sortingalgorithms;

import java.util.Arrays;

public class P3_SelectionSort {
    public static void main(String[] args) {
        int[]arr = {19,8,23,5,9,1};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i=0; i< arr.length; i++){
            int min_index = i;
            for (int j=i+1; j< arr.length; j++){
                if (arr[j]<arr[min_index]){
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}
