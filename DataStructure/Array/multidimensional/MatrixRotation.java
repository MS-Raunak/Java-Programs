package DataStructure.Array.multidimensional;

//Step-1: Transposed the matrix
//Step-2: Reverse the elements of each array in matrix
public class MatrixRotation {
    public static void main(String[] args) {
        int[][]arr = {
                {2,4,6},
                {6,8,10}
        };
        printArray(arr);
        transpose(arr, 3);
    }

    private static void transpose(int[][] arr, int col) {
        int row = arr.length;
        int[][]transposed = new int[col][row];

        for (int i=0; i<col; i++){
            for (int j=0; j<row; j++){
                transposed[i][j] = arr[j][i];
            }
        }

        rotation(transposed);
    }

    private static void rotation(int[][] transposed) {
        System.out.println("Rotated Matrix(90deg)");
        for (int i=0; i< transposed.length; i++){
            for (int j=transposed[i].length-1; j>=0; j--){
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printArray(int[][]arr){
        System.out.println("Original Matrix");
        for (int eles[] : arr){
            for (int ele : eles){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
