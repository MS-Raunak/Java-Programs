package DataStructure.Array.multidimensional;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter row: ");
        int row = sc.nextInt();
        System.out.print("enter col: ");
        int col = sc.nextInt();

        int[][]arr = new int[row][col];
        System.out.println("enter " + row*col + " elements");

        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
        spiral(arr, row, col);
    }

    private static void spiral(int[][] arr, int row, int col) {
        int topRow = 0, bottomRow = row-1;
        int leftCol = 0, rightCol = col-1;

        int totalElements = 0;
        while (totalElements <= row*col){
            //topRow -> leftCol to RightCol
            for (int i=leftCol; i<=rightCol; i++){
                System.out.print(arr[topRow][i] + " ");
                totalElements++;
            }
            System.out.println();
            topRow++;


            //RightCol -> topRow to bottomRow
            for (int i=topRow; i<=bottomRow; i++){
                System.out.print(arr[i][rightCol] + " ");
                totalElements++;
            }
            System.out.println();
            rightCol--;

            //bottomRow -> rightCol to leftCol
            for (int i=rightCol; i>=leftCol; i--){
                System.out.print(arr[bottomRow][i] + " ");
                totalElements++;
            }
            System.out.println();
            bottomRow--;

            //leftCol -> bottomRow to topRow
            for (int i=bottomRow; i>=topRow; i--){
                System.out.print(arr[i][leftCol] + " ");
                totalElements++;
            }
            System.out.println();
            leftCol++;
        }
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
