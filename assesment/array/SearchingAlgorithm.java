package assesment.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Linear Searching Algorithm : It works with any arrangement
 * 2. Binary Searching Algorithm : It works with only sorted array.
 */
public class SearchingAlgorithm {
    //static int[]arr = {14,22,9,45,33,2};
    static int[]arr = {2,9,14,22,33,45};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("enter key to search: ");
        int key = sc.nextInt();

        //linearSearch(arr, key);
        //binarySearch(arr, key);
        binarySearchUsingRecursion(arr, key, 0, arr.length);
    }

    //1. Linear Search
    private static void linearSearch(int[] arr, int key) {
        for (int i=0; i< arr.length; i++) {
            if (arr[i]==key){
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element is not found in existing array");
    }

    //2. Binary Search
    public static void binarySearch(int[]arr, int key) {
        int st=0;
        int end= arr.length;

        while (st <= end) {
            int mid = (st+end)/2;
            if (key==arr[mid]){
                System.out.println("Element found at index " + mid);
                return;
            }
            else if (key < arr[mid]) end = mid-1;
            else st=mid+1;
        }
        System.out.println("Element is not found in existing array");
    }

    //3. Binary Search using Recursion
    public static void binarySearchUsingRecursion(int[]arr, int key, int st, int end) {
        if (st>end){
            System.out.println("Not found");
            return;
        }

        int mid = (st+end)/2;
        if (key == arr[mid]){
            System.out.println("Element found at index " + mid);
            return;
        }
        else if (key < arr[mid])
            binarySearchUsingRecursion(arr, key, st, mid-1);
        else
            binarySearchUsingRecursion(arr, key, mid+1, end);
    }
}
