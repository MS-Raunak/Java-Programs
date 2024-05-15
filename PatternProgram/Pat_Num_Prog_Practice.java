package PatternProgram;

import java.util.Scanner;

class Pyramid1{
    //Triangle-1
    static void triangle1(int row){
        System.out.println("Triangle-1");
        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++)
                System.out.print("*" + " ");

            System.out.println();
        }
    }

    //Triangle-2
    static void triangle2(int row){
        System.out.println("\nTriangle-2: Reverse-1");

        for (int i=1; i<=row; i++){
            for (int j=0; j<=row-i; j++)
                System.out.print("*" + " ");

            System.out.println();
        }
    }

    //Triangle-3
    static void triangle3(int row){
        System.out.println("\nTriangle-3");

        for (int i=1; i<=row; i++){
            for (int space=1; space<i; space++)
                System.out.print(" " + " ");
            for (int j=1; j<=row-i+1; j++)
                System.out.print("*" + " ");

            System.out.println();
        }
    }

    //Triangle-4
    static void triangle4(int row){
        System.out.println("\nTriangle-4: Reverse-3");

        for (int i=1; i<=row; i++){
            for (int space=1; space<=row-i; space++)
                System.out.print(" " + " ");
            for (int j=1; j<=i; j++)
                System.out.print("*" + " ");

            System.out.println();
        }
    }


    // holo pyramid
    static void holoPyramid(int row){
        System.out.println("\n\nHolo PatternProgram.Pyramid");
        //row
        for (int i=1; i<=row; i++){
            // space
            for (int space=1; space<=row-i; space++)
                System.out.print(" " + " ");
            // print star
            for (int j=1; j<=i*2-1; j++){
                if (i==row || j==1 || j==i*2-1) System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }

            System.out.println();
        }
    }

    // holo reverse pyramid
    static void holoReversePyramid(int n){
        System.out.println("\n\nHolo Reverse PatternProgram.Pyramid");
        //row
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            int num = n*2-i; // nth value of j
            for (int j=i; j<= num; j++){
                if (i==1 || j==i || j==num )
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }

    // full pyramid
    static void fullPyramid(int n){
        System.out.println("\n\nFull PatternProgram.Pyramid");

        for (int i=1; i<=n; i++){
            for (int sp=1; sp<=n-i; sp++){
                System.out.print(" " + " ");
            }

            for (int j=1; j<=i*2-1; j++)
                System.out.print("*" + " ");

            System.out.println();
        }
    }

    // Reverse full pyramid
    static void reverseFullPyramid(int n){
        System.out.println("\n\nReverse Full PatternProgram.Pyramid");
        for (int i=1; i<=n; i++){
            //space
            for (int j=1; j<i; j++)
                System.out.print(" " + " ");
            // star
            for (int j=i; j<=n*2-i; j++)
                System.out.print("*" + " ");

            System.out.println();
        }
    }

    // Diamond Holo PatternProgram.Pyramid
//    static void diamondHoloPyramid(int size){
//        System.out.println("\n\n Diamond Holo PatternProgram.Pyramid");
//
//        for(int row=1; row<=size; row++){
//            for(int space=1; space<=size-row; space++)
//                System.out.print(" ");
//            for(int col=1; col<=(2*row)-1; col++) {
//                if (col==1 || col == (2*row)-1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
////
//            System.out.println();
//        }
//
//        for(int row=size-1; row>=1; row--){
//            for(int space=1; space<=size-row; space++)
//                System.out.print(" ");
//            for(int col=1; col<=(2*row)-1; col++) {
//                if (col==1 || col == (2*row)-1)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//
//            System.out.println();
//        }
//    }

    // Diamond Holo PatternProgram.Pyramid
    static void diamondHoloPyramid(int size){
        System.out.println("\n\n Diamond Holo PatternProgram.Pyramid");

        for(int row=1; row<size; row++){

            if (row<=size/2) {

                // space
                for (int space = 1; space <= size/2 - row; space++)
                    System.out.print(" ");
                for (int col = 1; col <= (2 * row) - 1; col++) {
                    if (col == 1 || col == (2 * row) - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }

            else {
                // space
                for (int space = 1; space <= row - size/2; space++)
                    System.out.print(" ");
                for (int col = row; col <= (2*size - row); col++) {
                    if (col == row || col == (2*size - row) - 2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

            }


//
            System.out.println();
        }


    }
    // Rhombus star pattern
    static void rhombusPattern(int n){
        for (int i=1; i<=n; i++){
            for (int space=1; space<i; space++)
                System.out.print(" " + " ");
            for (int j=1; j<=n; j++)
                System.out.print("*" + " ");

            System.out.println();
        }
    }

    // X pattern
    static void printX(int n){
        System.out.println("X Pattern");

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (j==i || j==(n+1)-i)
                    System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }

    // Square with 2 diagonal
    static void squareDiagonal(int n){

        System.out.println("Square with both diagonal");

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (i==1 || i==n) // first and last row
                    System.out.print("*" + " ");
                else if (j==1 || j == n)  // first column and last column
                    System.out.print("*" + " ");
                else if (j==i || j==(n+1)-i) // both diagonal
                    System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }

    // Snake number Pattern
    static void snakePattern(int n){

        int num=1;

        for (int i=1; i<=n; i++){
            if (i%2!=0){
                for (int j=1; j<=n; j++){
                    System.out.print(num + "\t");
                    num++;
                }
            }
            else {
                num = (num + n)-1;
                for (int j=1; j<=n; j++){
                    System.out.print(num + "\t");
                    num--;
                }
                num = num+(n+ 1);
            }

            System.out.println();;
        }
    }


}


class CheckNumber{
    //1. Next Prime Number
    static void nextPrime(int n){
        for (int num=n+1; ; num++){
            boolean flag = true;
            for (int j=2; j<=num/2; j++){
                if (num%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag) {
                System.out.println(num + " is the next prime number");
                break;
            }
        }
    }

    // 2. Strong Number: sum of factorial of each digit = num
    static void strongNumber(int n){

        int sum = 0;

        for (int i=n; i>0; i/=10){
            int digit = i%10;       // finding for digits

            int fact = 1;          // factorial of each digit
            for (int j=1; j<=digit; j++){
                fact = fact*j;
            }
            sum = sum + fact; // sum of fact of each digit
        }
        if (n==sum)
            System.out.println(n + " is a Strong Number");
        else
            System.out.println(n + " is a not Strong Number");
    }

    // 3. Strong Number in range
    static void strongNumInRange(int lowVal, int highVal){
        for (int i = lowVal; i<=highVal; i++){
            int sum = 0;
            for (int num = i; num>0; num/=10){
                int digit = num%10;

                int fact = 1;
                for (int j=1; j<=digit; j++){
                    fact = fact*j;
                }
                sum = sum + fact;
            }
            if (i==sum)
                System.out.println(i + ", ");
        }
    }

    // 4. Last 3 Strong Number in Range :
    static void lastSpecifiedStrongNum(int lowVal, int highVal){

        int count =0 ;
        for (int i= highVal; i>=lowVal; i--){
            int sum = 0;

            for (int num=i; num>0; num/=10){
                int digit = num %10;
                // Factorial of each digit
                int fact = 1;
                for (int j=1; j<=digit; j++)
                    fact = fact * j;
                sum = sum + fact;
            }

            if (i == sum){
                count++;
                if (count<=3) {
                    System.out.print(i + " ");
                }
            }

        }

    }

    // 5. Armstrong Number : sum of power of total digit of each digit = number
    static void armstrongNum(int n){
        int count = 0;
        int sum = 0;

        for (int num = n; num>0; num/=10){
            int digit = num%10;
            count++;
        }
        for (int num = n; num>0; num/=10){
            int digit = num%10;
            sum = sum + (int)Math.pow(digit,count);
        }
        if (sum==n)
            System.out.println(n + " is an Armstrong Number");
        else System.out.println(n + " is not an Armstrong Number");
    }

    // 6. Armstrong number in range
    static void armstrongNumInRange(int lowVal, int highVal){
        for (int num = lowVal; num<=highVal; num++){
            int count = 0;
            int sum = 0;

            // count total digit
            for (int i=num; i>0; i/=10)  count++;

            // sum of power of each digit
            for (int i=num; i>0; i/=10){
                int digit = i%10;//digit
                sum = sum + (int) Math.pow(digit,count);
            }

            if (sum==num)
                System.out.print(num + ", ");
        }
    }

    // 7. Last 2 Armstrong Number
    static void lastSpecifiedArmstrong(int lowVal, int highVal){

        int  count = 0; // for counting the number of Armstrong

        for (int num = highVal; num>=lowVal; num--){
            int countDigit = 0, sum = 0;

            // count digit
            for (int n = num; n>0; n/=10 ) countDigit++;

            for (int n = num; n>0; n/=10 ) {
                int digit = n%10;
                sum = sum + (int) Math.pow(digit, countDigit);
            }

            if (sum == num){
                count++;
                if (count<=3)
                    System.out.print(num + ", ");
            }
        }
    }

    // 8. Factorial Number
    static void factNum(int n){
        int fact = 1;
        for (int num = 1; num<=n; num++){
            fact = fact * num;
        }
        System.out.println("Factorial(" + n + ") = " + fact);
    }

    // 9. Factorial in range
    static void factInRange(int minVal, int maxVal){
        for (int num = minVal; num<=maxVal; num++){
            int fact = 1;
            for (int i=1; i<=num; i++)
                fact = fact*i;

            System.out.println("Factorial(" + num + ") = " + fact);
        }
    }

    // 10. Factorial of last 3 numbers in given range
    static void specifiedNumofFact(int minVal, int maxVal){

        int count = 0;

        for (int num = maxVal; num>=minVal; num--){
            int fact = 1;
            for (int i=1; i<=num; i++)
                fact = fact*i;

            count++;
            if (count<=3)
                System.out.println("Factorial(" + num + ") = " + fact);
        }
    }

    // 11. Fibonacci Series
    static void fibonacciSeries(int n){
        int a=0, b=1, c;
        for (int i=1; i<=n; i++){
            System.out.print(a + " ");
            c = a+b;
            a = b;
            b = c;
        }
    }

    // 12. Fibonacci Series in range
    static void fibonacInRange(int minVal, int maxVal){
        int a=0,b=1,c;
        while (a<=maxVal){
            c = a+b;
            a=b;
            b=c;
            if (a>=minVal)
                System.out.print(a + " ");

        }
        System.out.println("\n" + a + " is last");
    }

    // 13. Prime Number
    static void primeNum(int num){
        boolean flag = true;
        if (num>1){
            for (int i=2; i<=num/2; i++){
                if (num % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(num + " is a prime number..");
            else System.out.println(num + " is not a prime number..");
        }
        else System.out.println(num + " is not a prime number..");

    }

    // 14. Prime Number in range
    static void primeNumInRange(int minVal, int maxVal){
        for (int num = minVal; num<=maxVal; num++){
            //primeNum(num);
            boolean flag = true;
            if (num==1) continue;
            for (int i=2; i<=num/2; i++){
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(num + " is a prime");
        }
    }

    // 15. Last 3 prime number
    static void last3Prime(int minVal, int maxVal){
        // swapping
        if (minVal > maxVal){
            int c = minVal + maxVal;
            minVal = c-minVal;
            maxVal = c - minVal;
        }

        int count = 0;
        for (int num=maxVal; num>=minVal; num--){
            if (num==1 || num==0) continue;;
            boolean flag = true;
            for (int i=2; i<=num/2; i++){
                if (num%i==0){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                if (count <= 3)
                    System.out.print(num + " ");
            }
        }
    }

    // 16. Magic number : sum of each digit = 1, if sum>9 again count ex: 73 =>7+3=> 1+0 => 1, 1234=> 10 => 1
    static void magicNumber(int num){
        int sum = 0;
        for (int i=num; i>0; i/=10){
            sum = sum + i%10;
        }
        if (sum == 1) System.out.println(num + " is a magic number");
        else if (sum>9){
            int sum1=0;
            for (int j = sum; j > 0; j /= 10) {
                sum1 = sum1 + j % 10;
            }
            if (sum1 == 1) System.out.println(num + " is a magic number");
            else System.out.println(num + " is not a magic number");
        }
        else System.out.println(num + " is a not magic number");

    }

    // 17. Magic number in range
    static void magicNumInRange(int minVal, int maxVal){
        for (int number = minVal; number<=maxVal; number++){
//            magicNumber(num);
            // Number to check
            int sum = 0;
            for (int i=number; i>0; i/=10){
                sum = sum + i%10;
            }
            if (sum==1) System.out.println(number + " is a magic number");
            if (sum>9){
                int sum1 = 0;
                for (int i=sum; i>0; i/=10)
                    sum1 = sum1 + i%10;
                if (sum1==1) System.out.println(number + " is a magic number");

            }
        }
    }

    // 18. Last 3 Magic number in range : NOT COMPLETE SOLUTION
    static void lastSpecifiedMagicNumInRange(int minVal, int maxVal){
        for (int number = maxVal; number>=minVal; number--){

        }
    }




}

public class Pat_Num_Prog_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Row/Num\n 2.Range\n enter your choice for input:");
        int ch = sc.nextInt();
        int row=0,lowVal=0,highVal=0;

        switch (ch) {
            case 1 :
                System.out.println("Enter row/num:");
                row = sc.nextInt();
                break;

            case 2 :
                System.out.println("Enter range:");
                lowVal = sc.nextInt();
                highVal = sc.nextInt();
                break;

            default : System.out.println("Invalid input..Please try again!");
        }

//Method for Checking Number multiple times
//        PatternProgram.Pyramid.triangle1(row);
//        PatternProgram.Pyramid.triangle2(row);
//        PatternProgram.Pyramid.triangle3(row);
//        PatternProgram.Pyramid.triangle4(row);
//
//        PatternProgram.Pyramid.holoPyramid(row);
//        PatternProgram.Pyramid.holoReversePyramid(row);
//
//        PatternProgram.Pyramid.fullPyramid(row);
//        PatternProgram.Pyramid.reverseFullPyramid(row);

        Pyramid1.diamondHoloPyramid(row);
//        PatternProgram.Pyramid.rhombusPattern(row);
//        PatternProgram.Pyramid.printX(row);
//        PatternProgram.Pyramid.squareDiagonal(row);

//        PatternProgram.Pyramid.snakePattern(row);



//        PatternProgram.CheckNumber.nextPrime(row);
//        PatternProgram.CheckNumber.strongNumber(row);
//        PatternProgram.CheckNumber.strongNumInRange(lowVal, highVal);
//        PatternProgram.CheckNumber.lastSpecifiedStrongNum(lowVal,highVal);
//        PatternProgram.CheckNumber.armstrongNum(row);
//        PatternProgram.CheckNumber.armstrongNumInRange(lowVal, highVal);
//        PatternProgram.CheckNumber.lastSpecifiedArmstrong(lowVal, highVal);
//        PatternProgram.CheckNumber.factNum(row);
//         PatternProgram.CheckNumber.factInRange(lowVal, highVal);
//        PatternProgram.CheckNumber.specifiedNumofFact(lowVal, highVal);
//        PatternProgram.CheckNumber.fibonacciSeries(row);
//        PatternProgram.CheckNumber.fibonacInRange(lowVal, highVal);
//        PatternProgram.CheckNumber.primeNum(row);
//        PatternProgram.CheckNumber.primeNumInRange(lowVal, highVal);
//        PatternProgram.CheckNumber.last3Prime(lowVal, highVal);
//        PatternProgram.CheckNumber.magicNumber(row);
        CheckNumber.magicNumInRange(lowVal, highVal);
//        PatternProgram.CheckNumber.lastSpecifiedMagicNumInRange(lowVal, highVal);


    }
}