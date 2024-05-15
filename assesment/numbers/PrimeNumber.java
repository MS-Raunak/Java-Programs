package assesment.numbers;

import java.util.Scanner;

public class PrimeNumber {
   //Prime Number
    public static boolean isPrime(int num) {
        if (num==1) return false;
        for (int i=2; i<=num/2; i++) {
            if (num%i==0) return false;
        }
        return true;
    }

    //prime in range
    public static void primeInRange(int start, int end) {
        for (int n=start; n<=end; n++){
            if (isPrime(n)) System.out.println(n + " is a prime number");
        }
    }

    // alternative prime number
    public static void alterPrime(int start, int end){
        int count=0;
        for (int num=start; num<=end; num++){
            if (isPrime(num)) {
                count++;
                if (count%2==0) System.out.println(num + " is a prime number");
            }
        }
    }

    // every 3rd prime number
    public static void everyThirdPrime(int start, int end) {
        int count=0;
        for (int num=start; num<=end; num++) {
            if (isPrime(num)) {
                count++;
                if (count%3==0)
                    System.out.println(num + " is a prime number");
            }
        }
    }

    // Second last prime number
    public static void secondLastPrime(int start, int end){
        int temp=start;
        start=end;
        end = temp;

        int count=0;
        for (int num=start; num>=end; num--){
            if (isPrime(num)){
                count++;
                if (count==2) {
                    System.out.println(num + " is second last prime number in given range");
                    return;
                }

            }

        }
    }

    // sum of all prime number
    private static void sumOfAllPrime(int start, int end) {
        int sum=0;
        for (int num=start; num<=end; num++){
            if (isPrime(num)){
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }

    // Circular prime number: Prime numbers that remain prime when their digits are cyclically rotated.
    public static void circularPrime(int num) {
        if (isPrime(num)) {
            int temp=num;
            String rotatedNumStr = "";
            int rotatedNum=0;

            while (num!=temp){
                int d = num % 10;
                num /= 10;
                rotatedNumStr +=  d + num;
                rotatedNum = Integer.parseInt(rotatedNumStr);
                if (!isPrime(rotatedNum)) {
                    System.out.println("NOT circular");
                    return;
                }
            }
            System.out.println(" Circular");
        }
        else {
            System.out.println("NOT Circular");
        }

    }



    // Test the application
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selct input\n1-input\n2-input");
        int ch = sc.nextInt();

        int n=0;
        int n2=0;
        switch (ch){
            case 1:
                System.out.println("Enter input: ");
                n = sc.nextInt();
                break;
            case 2:
                System.out.println("Enter input-1: ");
                n = sc.nextInt();
                System.out.println("Enter input-2: ");
                n2 = sc.nextInt();
                break;
            default:
                System.out.println("Please enter 1 or 2 only");
        }

//        System.out.println(isPrime(n));
//        primeInRange(n, n2);
//        alterPrime(n, n2);
//         everyThirdPrime(n,n2);
//         secondLastPrime(n, n2);
//        sumOfAllPrime(n, n2);
        circularPrime(n);

    }


}
