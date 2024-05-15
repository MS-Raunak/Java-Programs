package DataStructure.Array.singledimensional;


public class P1_Demo {
    public static void main(String[] args) {
        int []arr = {1,9,6,2,12,10,121,15,0,16,1111,1111};
        secondMaxEle(arr);
    }

    private static void findSmallest(int[] arr) {
        int minEle = arr[0];
        for (int i=1; i< arr.length; i++){
            if (arr[i] < minEle)
                minEle = arr[i];
        }
        System.out.println("Minimum ele: " + minEle);
    }

    private static void findMaxEle(int[]arr){
        int maxEle = arr[0];
        int minEle = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i] > maxEle) maxEle = arr[i];
        }
        System.out.println("MAX ele: " + maxEle);
    }

    private static void findMinMaxEle(int[]arr){
        int maxEle = arr[0];
        int minEle = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i] > maxEle) maxEle = arr[i];
            if (arr[i] < minEle) minEle = arr[0];
        }
        System.out.println("MAX ele: " + maxEle);
        System.out.println("MIN ele: " + minEle);
    }

    private static void secondMaxEle(int[]arr){
        int maxEle = arr[0];
        int secMaxEle = 0;

        for (int i=1; i< arr.length; i++){

            if (arr[i] > maxEle){
                secMaxEle = maxEle;
                maxEle = arr[i];
            }
            if (arr[i] < maxEle && arr[i] > secMaxEle) secMaxEle = arr[i];
        }
        System.out.println("Second MAX ele: " + secMaxEle);
        System.out.println("MAX ele: " + maxEle);
    }


}
