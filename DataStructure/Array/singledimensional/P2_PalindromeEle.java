package DataStructure.Array.singledimensional;

public class P2_PalindromeEle {
    public static void main(String[] args) {
        int[]arr = {101, 232,405, 987, 234, 444, 2332,2,0,9};

        for (int i=0; i< arr.length; i++){
            if (isPalindrome(arr[i]))
                System.out.println(arr[i] + " is an palindrome element");
        }
    }

    private static boolean isPalindrome(int element) {
        if (element >= 0 && element<=9) return true;
        int sum = 0;
        for (int i=element; i>0; i/=10){
            sum = sum*10 + i%10;
        }
        if (element==sum) return true;
        return false;
    }
}
