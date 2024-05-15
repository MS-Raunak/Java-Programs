package DataStructure.Array.singledimensional;

public class P18_MaxConsecutiveEle {
    public static void main(String[] args) {
        int[]arr = {1,2,3,1,1,1,1,5,1,1,1}; //max consecutive of 1's is 4 which are(1,1,1,1)
        oneConsecutive(arr);

        int[]arr2={1,2,3,5,7,8,9,10}; // Ascending order max consecutive is 4 which are(7,8,9,10)
        ascConsecutive(arr2);
    }


    //Find 1's max consecutive
    private static void oneConsecutive(int[] arr) {
        int max = 0;

        for (int i=0; i< arr.length; i++) {
            int count=1;
            for (int j=i+1; j< arr.length; j++) {
                if (arr[i]==1 && arr[i]==arr[j]){
                    count++;
                    arr[j]=0;
                }
                else break;
            }
            if (arr[i]!=0 && max<count){
                max=count;
            }
        }
        System.out.println("1's max consecutive: " + max);
    }

    //Find max Ascending order consecutive elements
    private static void ascConsecutive(int[] arr2) {

        int max=0;
        int count=1;
        for (int i=0; i< arr2.length; i++) {
            if (i+1 < arr2.length && arr2[i]+1 == arr2[i+1]) count++;
            else if (max < count){
                max=count;
                count=1;
            }
        }
        System.out.println(max);
    }
}
