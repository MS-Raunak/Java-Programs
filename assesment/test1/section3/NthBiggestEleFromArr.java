package assesment.test1.section3;

import java.util.*;

public class NthBiggestEleFromArr {
    public static void main(String[] args) {
        int[]arr = {3,2,5,8,9,45,8,45};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();

        //findVal(arr,n); //without collection
        //findValue(arr,n); // with collection NOT DONE

    }

    private static void findValue(int[] nums, int n) {
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements to the TreeSet
        for (int num : nums) {
            set.add(num);
            // If the size of the TreeSet exceeds n, remove the smallest elemen
        }


    }

    private static void findVal(int[] arr, int n) {
        int count=1;
        for (int i=1; i< arr.length; i++) {
           for (int j=i+1; j< arr.length; j++){
               if (arr[i]==arr[j]) arr[j]=0;
           }
        }
        Arrays.sort(arr);
        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i]==0) {
                System.out.println("Array has less elements");
                return;
            }
            else if (count==n){
                System.out.println(arr[i]);
                return;
            }
            count++;
        }
    }
}
