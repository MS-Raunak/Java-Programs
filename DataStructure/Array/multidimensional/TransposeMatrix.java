package DataStructure.Array.multidimensional;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter row: ");
        int row = sc.nextInt();
        System.out.print("enter row: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
        transpose(arr, col);
    }

    private static void transpose(int[][] arr, int col) {
        int[][] transposed_arr = new int[col][arr.length];

        for (int i=0; i< col; i++){
            for (int j=0; j<arr.length; j++){
                transposed_arr[i][j] = arr[j][i];
            }
        }

        printArray(transposed_arr);
    }

    private static void printArray(int[][] arr) {
        for (int[]datas : arr){
            for (int data : datas){
                System.out.print(data + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
