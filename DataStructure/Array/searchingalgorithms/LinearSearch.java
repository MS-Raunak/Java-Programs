package DataStructure.Array.searchingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {23,12,54,16,31};
        System.out.println(Arrays.toString(arr));

        System.out.print("enter element that you want to search? ");
        int key = sc.nextInt();
        int key_index = search(arr,key);
        if (key_index==-1)
            System.out.println("Element not found in existing array");
        else System.out.println("Element found at index number " + key_index);
    }

    private static int search(int[] arr, int key) {
        for (int i=0; i<arr.length; i++){
            if (arr[i]==key) return i;
        }
        return -1;
    }
}
