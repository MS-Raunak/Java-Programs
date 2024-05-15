package NumberProgram;

public class FiboWithRecursion {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.print(fibo(i) + " ");;
        }
    }

    private static int fibo(int num) {
        if (num==0 || num==1) return num;
        return fibo(num-1) + fibo((num-1)-1);
    }
}
