package DataStructure.Array.singledimensional;

import java.util.Arrays;

public class P14_AddEleOfTwoArr {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,1};
        int[] arr2 = {2,3,5,6,7,8,9};


        for (int i=0; i< arr1.length; i++){
            arr2[i] = arr2[i]+arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
