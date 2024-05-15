package DataStructure.Array.singledimensional;

import java.util.Arrays;

public class P4_ReverseDigitOfEle {
    public static void main(String[] args) {
        int[]arr = {0,1,2,56,32,33,27,56};
        System.out.println("Orignal Array: " + Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            if (arr[i]>9){
                arr[i]=reverse(arr[i]);
            }
        }

        System.out.println("Modified Array: " + Arrays.toString(arr));
    }

    private static int reverse(int ele) {
        int rev=0;
        for (int i=ele; i>0; i/=10){
            int digit = i%10;
            rev = rev*10+digit;
        }
        return rev;
    }
}
