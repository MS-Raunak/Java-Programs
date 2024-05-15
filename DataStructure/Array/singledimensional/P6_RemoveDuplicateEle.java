package DataStructure.Array.singledimensional;

import java.util.Arrays;

public class P6_RemoveDuplicateEle {
    public static void main(String[] args) {
        int[]arr = {2,4,2,3,5,9,2,3,1};
        System.out.println(Arrays.toString(arr));

        int[]result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] removeDuplicates(int[] arr) {
        int count = 0;
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]==arr[j]) arr[j]=0;
            }
            if (arr[i]==0) count++;
        }

        int[] resArr = new int[arr.length-count];
        int index=0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]!= 0){
                resArr[index++] = arr[i];
            }
        }
        return resArr;
    }
}
