package DataStructure.Array.singledimensional;

import java.util.Arrays;
import java.util.Random;

public class P17_ShuffleEle {
    public static void main(String[] args) {
        int arr[] = {29,19,23,12,22,1};

        Random random = new Random();
        for (int i=0; i< arr.length; i++){
           int j= random.nextInt(arr.length);
           int temp = arr[j];
           arr[j] = arr[i];
           arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
