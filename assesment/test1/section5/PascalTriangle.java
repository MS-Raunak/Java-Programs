package assesment.test1.section5;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter rows:");
        int rows = sc.nextInt();
        int[][]arr = new int[rows][];

        pascal(arr);

    }

    public static void pascal(int[][] arr) {
        for (int i=0; i< arr.length;   i++) {
            arr[i] = new int[i+1];
            arr[i][0]=1;
            arr[i][i]=1;
            for (int j=1; j<i; j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }
        printArr(arr);
    }

    private static void printArr(int[][] arr) {
        int space= arr.length;

        for (int[] eles : arr) {
            for (int sp=0; sp<space; sp++)
                System.out.print(" ");
            for (int ele : eles)
                System.out.print(ele + " ");
            space--;
            System.out.println();
        }
    }
}
