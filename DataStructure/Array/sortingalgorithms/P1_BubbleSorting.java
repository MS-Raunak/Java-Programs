package DataStructure.Array.sortingalgorithms;

import java.util.Arrays;

public class P1_BubbleSorting {
    public static void main(String[] args) {
        int[]arr = {19,8,23,5,9,1};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
