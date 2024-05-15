package DataStructure.Array.singledimensional;

import java.util.Arrays;

public class P6_RemDuplicateEle {
    public static void main(String[] args) {
        int arr[] = {23,1,23,12,22,1};

        int temp[] = new int[arr.length];

        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]==arr[j]){
                    arr[j] = 0;
                }

            }
            if (arr[i]!=0){
                temp[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
/*
package single_dimension_array;

import java.util.Arrays;

public class _49RemoveDuplicateEle {
    public static void main(String[] args) {
        int[] arr = {30,10,20,10,30,40,50,10,10,10,40};
        int count = 0;

        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]==arr[j]) {
                    arr[i] = 0;
                    count++;
                }
            }
        }

        int newLength = arr.length-count;

        arr = removeDuplicate(arr,newLength);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] removeDuplicate(int[] arr, int newLength) {
        int[]newArr = new int[newLength];

        for (int i=0; i< newArr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]!=arr[j]) {
                    newArr[i] = arr[i];
                }
            }
        }

        return newArr;
    }
}

 */