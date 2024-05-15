package DataStructure.Array.singledimensional;

import java.util.Arrays;

public class P15_MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {13,28,3,7,9,26};
        int[] arr2 = {23,21,6,14};

        int[]newArr = new int[arr1.length+ arr2.length];
        merge(arr1,arr2,newArr);
    }

    private static void merge(int[] arr1, int[] arr2, int[]newArr) {
        int j=0;
        for (int i=0; i< newArr.length; i++){
            if (i<arr1.length){
                newArr[i]=arr1[i];
            }
            else {
                if (j< arr2.length){
                    newArr[i]=arr2[j];
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
