package DataStructure.Array.sortingalgorithms;

import java.util.Arrays;

public class P5_MergeSort {
    public static void main(String[] args) {
        int[]arr = {19,8,23,5,9,1};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        divide(arr, 0, arr.length-1);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

    private static void divide(int[] arr, int st, int end) {
        if (st>=end) return;
        int mid = (st+end)/2;

        divide(arr, st, mid);
        divide(arr, mid+1, end);

        sort(arr, st, mid, end);
    }

    private static void sort(int[] arr, int st, int mid, int end) {
        int[]temp = new int[(end-st)+1];

        int start1 = st;
        int start2 = mid+1;
        int i=0;

        while (start1 <= mid && start2 <=end){
            if (arr[start1] < arr[start2])
                temp[i++] = arr[start1++];
            else temp[i++] = arr[start2++];
        }
        while (start1<=mid) temp[i++] = arr[start1++];
        while (start2<=end) temp[i++] = arr[start2++];

        int j=st;
        for (int ele : temp){
            arr[j] = ele;
            j++;
        }
    }
}
