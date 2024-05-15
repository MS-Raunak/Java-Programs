package DataStructure.Array.singledimensional;

public class P3_CountZero {
    public static void main(String[] args) {
        int[]arr = {1,2,0,3,0,4,5,0};
        int count=0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]==0){
                count++;
            }
        }
        System.out.println("Total Zero: " + count);
    }
}
