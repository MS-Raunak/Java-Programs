package DataStructure.recursion;

public class P8_SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sum(123));;
    }

    private static int sum(int n) {
        if (n==0) return 0;
        return sum(n/10) + sum(n%10);
    }
}
