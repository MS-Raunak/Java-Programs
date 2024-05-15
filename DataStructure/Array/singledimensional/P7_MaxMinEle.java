package DataStructure.Array.singledimensional;

public class P7_MaxMinEle {
    public static void main(String[] args) {
        int[]arr = {13,45,23,12,6,11};

        int min = arr[0];
        int max = arr[0];

        for (int i=1; i< arr.length; i++){
            if (arr[i] < min) min=arr[i];
            if (arr[i] > max) max=arr[i];
        }

        System.out.println("Smallest Element: " + min);
        System.out.println("Largest Element: " + max);
    }
}
