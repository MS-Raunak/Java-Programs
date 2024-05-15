package interview;

import java.util.Scanner;

public class CircularPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isPrime(n)){
            int temp=n;
            reverses(n, temp, 0);
        }
        else System.out.println("NOT Circular Prime");
    }

    private static void reverses(int n, int temp, int reverse) {

        if (reverse==temp) {
            System.out.println("Circular Prime Number");
            return;
        }

        for(int i=n; i>0; i/=10){
            reverse = reverse*10 + i%10;
        }

        while (reverse!=temp){
            if (isPrime(reverse)) {
                reverses(reverse, temp, reverse);
            }
            else System.out.println("Not a Circular Prime Number");
            return;
        }

    }

    private static boolean isPrime(int n) {
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
               return false;
            }
        }
        return true;
    }
}



