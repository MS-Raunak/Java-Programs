package DataStructure.Array.sortingalgorithms;

import java.util.Arrays;
//Not working correctly

public class P4_QuickSort {
    public static void main(String[] args) {
        int[]arr = {19,8,23,5,9,1};
//        int []arr = {9,6,2,12,10,1};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        sort(arr, 0, arr.length-1);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

    private static void sort(int[] arr, int st, int end) {
        if (st>=end) return;

        int i=st;
        int j=end;

        while (i<=j){
            int pivot = (st+end)/2;
            while (arr[i]<arr[pivot]) i++;
            while (arr[j]>arr[pivot]) j--;

            if (i<=j){
                int temp = arr[i];
                arr[i]  = arr[j];
                arr[j] = temp;
            }
            i++;
            j--;
        }
        sort(arr, st, j);
        sort(arr, i, end);
    }
}
