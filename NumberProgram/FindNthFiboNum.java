package NumberProgram;

import java.util.Scanner;

public class FindNthFiboNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter nth positon: ");
        int n= sc.nextInt();

        System.out.println(find(0,1, n));;
    }

    public static int find(int a, int b, int n){
        int res=0;
        for (int i=1; i<=n; i++){
            int c = a+b;
            if (i==n) res = a;
            a=b;
            b=c;

        }
        return res;
    }
}
