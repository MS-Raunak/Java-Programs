package DataStructure.Array.singledimensional;

public class P8_LargestElement {
    public static void main(String[] args) {
        int[]arr = {1,2,56,32,33,27};

        int max=0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]>max) max=arr[i];
        }
        System.out.println("Greatest number: " + max);
    }
}
