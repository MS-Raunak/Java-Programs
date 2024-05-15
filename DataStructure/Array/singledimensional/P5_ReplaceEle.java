package DataStructure.Array.singledimensional;

import java.util.Arrays;

//Replace 0 with -1 and -1 with 0
public class P5_ReplaceEle {
    public static void main(String[] args) {
        int []arr = {1,2,0,5,-1,0,8,12,0};

        for (int i=0; i< arr.length; i++){
            if (arr[i]==0) arr[i]=-1;
            else if (arr[i]==-1) arr[i]=0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
