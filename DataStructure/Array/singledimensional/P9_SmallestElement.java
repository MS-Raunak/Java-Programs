package DataStructure.Array.singledimensional;

public class P9_SmallestElement {
    public static void main(String[] args) {
        int[]arr = {0,1,2,56,32,33,27,56};
        int min = arr[0];

        for (int i=0; i< arr.length; i++){
            if (arr[i]<min) min = arr[i];
        }
        System.out.println("Smallest element: " + min);
    }
}
