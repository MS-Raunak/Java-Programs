package DataStructure.Array.searchingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

//Binary search works for only sorted array
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {2,4,6,8,9};
        System.out.println(Arrays.toString(arr));

        System.out.print("enter element that you want to search? ");
        int key = sc.nextInt();
        int key_index = search(arr,key, 0, arr.length-1);
        if (key_index==-1)
            System.out.println("Element not found in existing array");
        else System.out.println("Element found at index number " + key_index);
    }

    private static int search(int[] arr, int key, int st, int end) {
        if (st>end) return -1;
        int mid = (st+end)/2;
        if (key==arr[mid]) return mid;
        else if (key<arr[mid]) return search(arr, key, st, mid-1);
        else return search(arr, key, mid+1, end);

    }
}
