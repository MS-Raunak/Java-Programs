package DataStructure.recursion;

public class P2_PrintDecreasing {
    public static void main(String[] args) {
        int n=10;
        printIncreasing(n);
    }

    private static void printIncreasing(int n) {
        if (n==0) return;
        System.out.print(n + " ");
        printIncreasing(n-1);
    }
}
