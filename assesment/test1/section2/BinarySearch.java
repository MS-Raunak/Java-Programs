package assesment.test1.section2;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr = {2,4,6,7,9,10};
       int getIndex= search(arr, 20, 0, arr.length);
        System.out.println(getIndex);
    }

    private static int search(int[] arr, int key, int st, int end) {
        if (st<end) {
            int mid = (st+end)/2;
            if (arr[mid]==key) return mid;
            else if (key < arr[mid])
                return search(arr, key, st, mid);
            else return search(arr, key, mid+1, end);
        }
        return -1;
    }
}
