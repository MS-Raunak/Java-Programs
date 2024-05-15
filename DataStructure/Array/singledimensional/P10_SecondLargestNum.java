package DataStructure.Array.singledimensional;

import java.util.Arrays;

public class P10_SecondLargestNum {
    public static void main(String[] args) {
        int[]arr = {1,2,56,32,33,27,55};

        System.out.println("Second Largest Element: " + sort(arr));;
    }

    private static int findLargetsEle(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int max = arr[arr.length-1];
        int secondMaxEle=0;
        for (int i=arr.length-1; i>=0; i--){
            if (arr[i]!=max) {
                secondMaxEle=arr[i];
                break;
            }
        }
        return secondMaxEle;
    }

    private static int sort(int[] arr) {
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return findLargetsEle(arr);
    }
}
