package assesment.array;

public class MultiDimenProgram {

    //print array
    public static void display(int[][]arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j< arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Add two matrix
    public static void addMatrices() {
        int[][]arr = {{1,1,1,1},{2,2,2,2}};
        int[][]arr2 = {{4,4,4,4},{3,3,3,3}};
        int[][]res = new int[arr.length][arr[0].length];

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j< arr[i].length; j++) {
                res[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        display(res);
    }

    // Multiply two matrices
    public static void multiplyMatrices() {
        int[][]arr = {{1,1,1,1},{2,2,2,2}};
        int[][]arr2 = {{4,4,4,4},{3,3,3,3}};
        int[][]res = new int[arr.length][arr[0].length];

        for (int i=0; i< arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                res[i][j] = arr[i][j]*arr2[i][j];
            }
        }
        display(res);
    }

    // Matrix Transposition
    public static void transpose() {
        int[][]arr = {
                {1,2,3,4},
                {5,6,7,8}
        };

        int[][]res = new int[arr[0].length][arr.length];
        int[][]res1 = new int[res[0].length][res.length];

        for (int i=0; i< res.length; i++) {
            for (int j=0; j< res[i].length; j++){
                res[i][j] = arr[j][i];
            }
        }
        display(res);
    }

    //Matrix Rotation 90deg
    public static void rotate() {
        int[][]arr = {
                {1,2,3,4},
                {5,6,7,8}
        };
        System.out.println("Original array");
        display(arr);

        //first step - transpose the matrix
        int[][]transpose = new int[arr[0].length][arr.length];
        for (int row=0; row< transpose.length; row++){
            for (int col=0; col<transpose[row].length; col++) {
                transpose[row][col] = arr[col][row];
            }
        }
        System.out.println("Transposed Matrix");
        display(transpose);
        System.out.println("Rotated Matrix(90deg)");

        //second step - reverse transpose matrix
        for (int row=0; row< transpose.length; row++) {
            for (int col= transpose[row].length-1; col>=0; col--){
                System.out.print(transpose[row][col] + " ");
            }
            System.out.println();
        }

    }

    // Spiral Matrix
    public static void spiralMatrix() {
        int[][]arr = {
                {1,2,3,4},
                {5,6,7,8}
        };

    }

    //Application driver
    public static void main(String[] args) {
        int[][]arr = {{1,2,3,4},{4,5,6,7}};
        //display(arr);
        //addMatrices();
       // multiplyMatrices();
        //transpose();
        rotate();
    }
}
