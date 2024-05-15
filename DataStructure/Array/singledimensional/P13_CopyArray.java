package DataStructure.Array.singledimensional;

import java.util.Arrays;

public class P13_CopyArray {
    public static void main(String[] args) {
        int[]arr = {0,1,2,56,32,33,27,56};
        copyElements(arr);
    }

    private static void copyElements(int[] arr) {
        int new_arr[] = new int[arr.length];

        for (int i=0; i< arr.length; i++){
            new_arr[i]=arr[i];
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Copied Array: " + Arrays.toString(new_arr));
    }
}
