package NumberProgram;

import java.util.Scanner;

public class BinToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int bin = sc.nextInt();
        System.out.println("Binary number: " + bin);
        int dec = convertIntoDecimal(bin);
        System.out.println("Decimal number: " + dec);
    }

    private static int convertIntoDecimal(int num) {
        if (num==1) return 1;
        else if (num==0) return 0;
        else {
            int decNum = 0,  powVal=0;
            for (int i=num; i>0; i/=10){
                int digit = i%10;
                decNum += (int) (digit * Math.pow(2,powVal++));
            }
            return decNum;
        }

    }
}

/*
101 => 1(2^0) + 0(2^1) + 1(2^2) = > 5
 */