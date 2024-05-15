package DataStructure.recursion;


public class P1_PrintIncrease {
    public static void main(String[] args) {
        int n=1;
        printIncreasing(n);
    }

    private static void printIncreasing(int n) {
        if (n>10) return;
        System.out.print(n + " ");
        printIncreasing(n+1);
    }
}
