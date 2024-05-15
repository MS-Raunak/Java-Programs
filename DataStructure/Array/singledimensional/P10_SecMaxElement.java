package DataStructure.Array.singledimensional;

public class P10_SecMaxElement {
    public static void main(String[] args) {
        int arr[] = {12,3,44,21,23,12,44,23,23,22};

        System.out.println("Second Max element :" + secondLargestVal(arr));
    }

    public static int secondLargestVal(int[]arr){
        int max = arr[0];
        int max2 = 0;

        for (int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max2 = max;
                max=arr[i];
            }
            if (arr[i] > max2 && arr[i] < max) max2 = arr[i];
        }
        return max2;
    }
}
