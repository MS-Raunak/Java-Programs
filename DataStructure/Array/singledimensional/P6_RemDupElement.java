package DataStructure.Array.singledimensional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class P6_RemDupElement {
    public static void main(String[] args) {
        int arr[] = {23,1,23,12,22,1};

        removeDuplicate(arr);
    }

    private static void removeDuplicate(int[] arr) {
        HashSet set = new HashSet<>();

        for (int i=0; i< arr.length; i++){
            set.add(arr[i]);
        }

        int[]res = new int[set.size()];

        Iterator iterator = set.iterator();

        int j=0;
        while (iterator.hasNext()){
           int ele = (int) iterator.next();
           res[j++] = ele;
        }

        System.out.println(Arrays.toString(res));
    }
}
