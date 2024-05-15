package NumberProgram;

import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int dec = sc.nextInt();
        System.out.println("Decimal number: " + dec);
        int  bin = convertIntoBinary(dec);
        System.out.println("Binary number: " + bin);
    }

    private static  int convertIntoBinary(int num) {
        if (num==0) return 0;
        if(num==1) return 1;

        String bin="";
        for (int i=num; i>0; i/=2){
            int digit = i%2;
            bin = digit+bin;
        }

        return Integer.parseInt(bin);
    }
}


/*
Decimal To Binary:
EX:
5  => Input
101 => Output

5/2 = 2 => remainder(2%2)=1
2/2 = 1 => remainder(1%2)=0
1/2 = 0 => remainder(0%2)=1
-------------------------------
     binary of 5   =>    101

Explanation: 1*2^0 + 0*2^1 + 0*2^2 =5

*/