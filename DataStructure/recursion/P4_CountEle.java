package DataStructure.recursion;

public class P4_CountEle {

    public static int count(int[]arr, int key, int c){
        if (c== arr.length) return 0;
        if (arr[c] == key) return 1+count(arr,key,c+1);
        return count(arr, key, c+1);

    }
    public static void main(String[] args) {
        int[]arr = {2,2,2,2,2,2,2};
        System.out.println(count(arr, 2, 0));
    }
}
