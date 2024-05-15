package assesment.test1.section5;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows: "); int rows = sc.nextInt();
        System.out.print("enter cols: "); int cols = sc.nextInt();
        int[][]arr = new int[rows][cols];

        System.out.println("enter " + rows*cols + " elements");
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        spiral(arr, rows, cols);
    }

    public static void spiral(int[][] arr, int rows, int cols) {
        int topRow = 0;
        int bottomRow = rows-1;
        int leftCol = 0;
        int rightCol=cols-1;

        int totalElements=0;

        while (totalElements <= rows*cols) {
            //topRow = leftCol -> rightCol
            for (int i = leftCol; i <= rightCol; i++) {
                System.out.print(arr[topRow][i] + " ");
                totalElements++;
            }
            System.out.println();
            topRow++;

            //leftCol = topRow -> bottomRow
            for (int i=topRow; i<=bottomRow; i++){
                System.out.print(arr[i][rightCol] + " ");
                totalElements++;
            }
            System.out.println();
            rightCol--;

            //bottomRow = rightCol -> leftCol
            for (int i=rightCol; i>=leftCol; i--){
                System.out.print(arr[bottomRow][i] + " ");
                totalElements++;
            }
            System.out.println();
            bottomRow--;

            //leftCol = bottomRow -> topRow
            for (int i=bottomRow; i>=topRow; i--){
                System.out.print(arr[i][rightCol]);
                totalElements++;
            }
            System.out.println();
            leftCol++;
        }
    }


}
