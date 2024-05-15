package DataStructure.Array.multidimensional;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter row: ");
        int row = sc.nextInt();

        int[][]arr = new int[5][];
        pascal(arr);
    }

    private static void pascal(int[][] arr) {
        for (int i=0; i< arr.length; i++){
            arr[i] = new int[i+1];
            arr[i][0] = 1;
            arr[i][i] = 1;
            for (int j=1; j<i; j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }

        printPascal(arr);
    }

    private static void printPascal(int[][] arr) {
        int space = arr.length;

        for (int[] elements : arr){
            for (int sp=0; sp<space; sp++){
                System.out.print(" ");
            }
            for (int ele : elements){
                System.out.print(ele + " ");
            }
            space--;
            System.out.println();
        }

    }
}
