package assesment.array;

import java.util.Arrays;
import java.util.Random;

/**
 * 1. Write a program to find Sum of all elements of an array
 * 2. Write a program to find The Largest element of an array
 * 3. Write a program to find The Smallest element of an array
 * 4. Write a program to find The Largest & Smallest ele together of an array
 * 5. Write a program to find Second max element of an array
 * 6. Write a program to check whether tha any ele is Palindrome or not in an array
 * 7. Write a program to Remove duplicate element of an array
 * 8. Write a program to Shuffle array elements.
 * 8. Write a program to Add two array in sorted format.
 */
public class SingleDimProgram {
    //Driver method
    public static void main(String[] args) {
        // sumOfEle();
        // largestEle();
        // smallestEle();
        // minMax();
        // secondMaxEle();
        // palindromeEle();
        removeDuplicateEle();
        // shuffleEle();
        //copyEle();
        //addArrSorted();
    }

    //1. Sum of all elements
    public static void sumOfEle(){
        int[]arr = {1,2,3,4,5};
        int sum=0;
        for (int i=0; i< arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of all elements: " + sum);
    }

    //2. Largest element
    public static void largestEle() {
        int[]arr = {1,20,3,4,50};
        int max=0;
        for (int i=0; i< arr.length; i++) {
            if (arr[i] > max)
                max=arr[i];
        }
        System.out.println("Largest ele: " + max);
    }

    //3. Smallest element
    public static void smallestEle() {
        int[]arr = {0,1,20,3,4,50};
        int min = arr[0];

        for (int ele : arr) {
            if (ele < min)
                min=ele;
        }
        System.out.println("Smallest ele: " + min);
    }

    //4. Largest & Smallest ele together
    public static void minMax() {
        int[]arr = {0,1,20,3,4,50};
        int min = arr[0];
        int max = 0;

        for (int ele : arr) {
            if (ele < min)
                min=ele;
            else if (ele > max)
                max=ele;
        }
        System.out.println("Smallest ele: " + min);
        System.out.println("Largest ele: " + max);
    }

    //5. Second max element
    public static void secondMaxEle() {
        int[]arr = {0,1,20,3,4,50,32};
        int max=0;
        int max2=0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max=arr[i];
            }
            else if (max2 < max &&  max2 < arr[i])
                max2 = arr[i];
        }
        System.out.println("Second largest ele: " + max2);
    }

    //6. Palindrome ele
    public static void palindromeEle() {
        int[]arr = {10,13,22,31,45,33};
        for (int ele : arr){
            if (isPalindrome(ele))
                System.out.println(ele + " is Palindrome");
        }
    }
    private static boolean isPalindrome(int ele) {
        int rev=0;
        for (int i=ele; i>0; i/=10){
            rev = rev*10 + i%10;
        }
        return ele == rev;
    }

    //7. Remove duplicate element
    public static void removeDuplicateEle(){
        int[]arr = {10,13,22,31,45,22,13};
        System.out.println("Original array: " + Arrays.toString(arr));
        int count=0;
       for (int i=0; i< arr.length; i++) {
           for (int j=i+1; j< arr.length; j++) {
               if (arr[i]==arr[j]) {
                   arr[j]=0;
               }
           }
           if (arr[i]!=0) count++;
       }
        int[] resArr = new int[count];

        int idx=0;
        for (int i=0; i< arr.length; i++) {
            for (int j=i+1; j< arr.length; j++) {
                if (arr[i]==arr[j]) {
                    arr[j]=0;
                }
            }
            if (arr[i]!=0) resArr[idx++] = arr[i];
        }
        System.out.println("Modified array: " + Arrays.toString(resArr));

    }
    private static int indexOfEle(int[]arr, int ele) {
        for (int i=0; i< arr.length; i++) {
            if (arr[i]==ele) return 1;
        }
        return -1;
    }

    //8. Shuffle array elements
    public static void shuffleEle() {
        int[]arr = {13,42,12,33,55,1};
        Random random = new Random();
        for (int i=0; i< arr.length; i++) {
            int j = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("Original array: " + Arrays.toString(arr));
    }

    //Copy element in another array
    public static void copyEle() {
        int[]arr = {12,34,64,12};
        int[] res = new int[arr.length];

        for (int i=0; i< arr.length; i++) {
            res[i] = arr[i];
        }
        System.out.println("Original array: " + Arrays.toString(res));

    }

    //9. Add two array in sorted format
    public static void addArrSorted() {
        int[]arr = {1,4,7,23,2,5,6};
        int[]arr2={13,56,11,17,9};
        int[]res = new int[arr.length+arr2.length];

        for (int i=0; i< arr.length; i++) {
            if (arr[i] < arr2[i])
                res[i] = arr[i];
            else if (arr2[i] < arr[i])
                res[i] = arr[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
