package NumberProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isPrime(num)) System.out.println(num + " is a Prime Number");
        else System.out.println(num + " is Not a Prime Number");
    }

    private static boolean isPrime(int num) {
        if (num==0 || num==1) return false;
        if (num==2) return true;

        boolean flag = true;
        for (int i=2; i<=num/2; i++){
            if (num%2==0){
                flag = false;
                break;
            }
        }
        if (flag) return true;
        else return false;
    }
}


/*
A number which is divisible by either 1 or itself is known as Prime Number
EX:2,3,5,7,11,13,17...
NOTE: 0 and 1 is not consider as a prime number
 */