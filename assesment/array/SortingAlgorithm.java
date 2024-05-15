package assesment.array;

import java.util.Arrays;

/**
 * 1. Bubble Sorting
 * 2. Insertion Sorting
 * 3. Selection Sorting
 * 4. Quick Sorting
 * 5. Merge Sorting
 *
 */
public class SortingAlgorithm {
    static int[]arr = {13,9,10,77,6,2};
    public static void main(String[] args) {
        System.out.println("Array Before Sorted: " + Arrays.toString(arr));
        //bubbleSort(arr);
        //insertionSort(arr);
        //selectionSort(arr);
        //quickSort(arr);
        mergeSort(arr,0, arr.length-1);
        System.out.println("Array After Sorted: " + Arrays.toString(arr));    }

    //1. Bubble Sort
    public static void bubbleSort(int[] arr) {
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    //2. Insertion Sort
    public static void insertionSort(int[]arr) {
        for (int i=1; i< arr.length; i++){
            int j=i;
            while (j>0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    //3.Selection Sort
    public static void selectionSort(int[]arr) {
        for (int i=0; i< arr.length; i++) {
            int min_index = i;
            for (int j=i+1; j< arr.length; j++) {
                if (arr[min_index] > arr[j])
                    min_index=j;
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    //4. Quick Sort
    public static void quickSort(int[]arr){}

    //Merge Sort
    public static void mergeSort(int[]arr, int st, int end){
        if (st < end) {
            int mid = (st+end)/2;
            mergeSort(arr, st, mid);
            mergeSort(arr, mid+1, end);
            merge(arr,st,mid,end);
        }
    }

    private static void merge(int[] arr, int st, int mid, int end) {
        int leftArrIdx = st;  //leftArr ( st to mid, where mid is endIndex of leftArr)
        int rightArrIdx = mid+1; // rightArr( mid+1 is the startIndex of rightArr)

        int[]temp = new int[(end-st)+1];
        int tempIdx=0;

        //compare left array elements and right array elements and store in the temp array
        while (leftArrIdx <= mid && rightArrIdx <= end){
            if (arr[leftArrIdx] < arr[rightArrIdx]) temp[tempIdx++] = arr[leftArrIdx++];
            else temp[tempIdx++] = arr[rightArrIdx++];
        }

        //when rightArr elements get sorted and left arr elements are still left then just copy them in temp
        while (leftArrIdx <= mid ) temp[tempIdx++] = arr[leftArrIdx++];
        //when rightArr elements get sorted and left arr elements are still left then just copy them in temp
        while (rightArrIdx <= end ) temp[tempIdx++] = arr[rightArrIdx++];

        //Copy all the elements of temp array into original(arr) array
        int j=st;
        for (int ele : temp) {
            arr[j] = ele;
            j++;
        }
    }


}
