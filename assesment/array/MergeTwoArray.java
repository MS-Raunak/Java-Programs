package assesment.array;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr = {5, 9, 12, 17, 32, 39, 47};
        int[] arr2 = {7, 8, 19, 23, 41};

        int[] ans = merge(arr, arr2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] merge(int[] arr, int[] arr2) {
        int[] ans = new int[arr.length + arr2.length];

        int idx1 = 0;
        int idx2 = 0;
        int ansIdx = 0;

        while (idx1 < arr.length && idx2 < arr2.length) {
            if (arr[idx1] < arr2[idx2]) {
                ans[ansIdx] = arr[idx1];
                ansIdx++;
                idx1++;
            } else {
                ans[ansIdx] = arr2[idx2];
                ansIdx++;
                idx2++;
            }
        }

        while (idx1 < arr.length) {
            ans[ansIdx] = arr[idx1];
            ansIdx++;
            idx1++;
        }
        while (idx2 < arr2.length) {
            ans[ansIdx] = arr2[idx2];
            ansIdx++;
            idx2++;
        }

        return ans;
    }

}
