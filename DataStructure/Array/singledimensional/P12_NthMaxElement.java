package DataStructure.Array.singledimensional;

import java.util.Arrays;
import java.util.Scanner;

public class P12_NthMaxElement {
    public static void main(String[] args) {
        int[]arr = {45,12,43,23,56,4,4,45};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Which max element you want to get: ");
        int n = sc.nextInt();

        int val = find(arr, n);
        if (val!=0) System.out.println(n + "th max element is " + val );
        else System.out.println("Please enter valid position");
    }

    private static int find(int[] arr, int n) {
        int count=0;
        for (int i= arr.length-1; i>=0; i--){
            count++;
            if (count==n) return arr[i];
        }

        return 0;
    }
}
