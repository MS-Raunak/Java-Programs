package DataStructure.Array.singledimensional;

import java.util.Arrays;

public class P16_SwapUntilSorted {
    public static void main(String[] args) {
        int[] arr = {23,5,33,19,0,56,1};
        System.out.println(Arrays.toString(swap(arr)));
    }

    private static int[] swap(int[] arr) {
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
                break;
            }
        }

        if (!isSorted(arr)){
            swap(arr);
        }

        return arr;
    }

    private static boolean isSorted(int[] arr) {
        if (arr.length == 1  || arr.length == 0) return true;
        for (int i=1; i< arr.length; i++){
            if (arr[i] < arr[i-1]) return false;
        }
        return true;
    }
}
