package DataStructure.Array.searchingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearchWithoutRecursion {
    public static void main(String[] args) {
        int[]arr = {2,4,6,8,10,12};
        System.out.println(Arrays.toString(arr));
        Scanner s = new Scanner(System.in);
        System.out.print("enter element: ");
        int key = s.nextInt();

        System.out.println(binarySearch(arr,key));
    }

    private static int binarySearch(int[] arr, int key) {

        int st = 0;
        int end = arr.length;

        while (st<=end){
            int mid = (st+end)/2;
            if (key == arr[mid]) return mid;
            else if (key < arr[mid]) {
                end = mid-1;
            }
            else st = mid + 1;
        }
        return -1;
    }
}
