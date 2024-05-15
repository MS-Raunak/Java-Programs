package assesment.recursion;

import java.util.Arrays;

public class Test {

    //Increment(EX: Print 1 to 10)
    private static void increment(int n) {
        /*
         * aim: print 1 to 10
         * step-1: take input the initial value(in 1 to 10 initial i/p is 1)
         * step-2 write base condition(in this ex, if n <=10 then print the
         *            value of n otherwise as soon as n > 10 return
         */

        //Approach-1: When inp is min(ex:1)
        //base condition
        if (n > 10) return;

        //induction code
        System.out.println(n);
        increment(n+1);

        //Approach-2: When inp is max(ex:10)
        /*if (n < 1) return;
        increment(n-1);
        System.out.println(n);*/
    }
// Decrement (EX Print 10 to 1)
    private static void decrement(int n) {
        /*
         * aim: print 10 to 1
         * step-1: take input the initial value(in 10 to 1 initial i/p is 10)
         * step-2 write base condition(in this ex, if n > 0 then print the
         *            value of n otherwise as soon as n = 0 return
         */
        //Approach-1: when input is maximum(ex i/p: 10)
        /*if (n  < 1 ) return;
        System.out.println(n);
        decrement(n-1);*/

        //Approach-2: when input is minimum(ex i/p: 1)
        if (n  > 10 ) return;
        decrement(n+1);
        System.out.println(n);
    }

    //Factorial
    private static int factorial(int n) {
        if (n==1) return 1; //base condition
        return n*factorial(n-1); // induction code

        /*
         * aim factorial(5) => 120 is output
         * approach: 120=> 5x4x3x2x1
         * step-1: write base condition if n==1 return 1;
         * step-2: write induction code which is nothing but n*(n-1)
         *
         * Explanation:
         * 5 * factorial(5-1) => 5 * 4
         * 5*4 * factorial(5-1-1) => 5*4*3
         * 5*4*3* factorial(5-1-1-1) => 5*4*3*2
         * 5*4*3*2*factorial(5-1-1-1-1) => 5*4*3*1
         * 5*4*3*2*1*factorial(5-1-1-1-1-1) => 5*4*3*2*1*0(base cond got true, return 1)
         * 5*4*3*2*1*1 = 120
         */
    }

    // Summession of n number(sum of n natural number):- Approach-1- Parameterized way
    public static void sum1(int num, int sum) {
        if (num < 1 ) {
            System.out.println(sum);
            return;
        }
        sum1(num-1, num+sum);
        /*
         * step-1: create the function with parameter target num  and a variable to perform summesion
         * step-2: call the function recursively by updating num by num-1 and sum by sum+num
         * step-3: write base condition, when num becomes 0 then print the sum and then return
         */
    }

    // Summession of n number(sum of n natural number):- Approach-2- Without Parameterized way
    public static int sum2(int num) {
        if(num < 1) return num;
        return  num + sum2(num-1);

        /**
         * step-1: create the function with a parameter target num.
         * step-2: call the function recursively by updating num by num-1 and the value which has to return, add that number with num
         * step-3: write base condition, when num becomes 0 then  return num
         */
    }

    //Reverse Array
    public static void reverseArray(int[] arr, int i, int j) {
        if (i>=j) {
            System.out.println(Arrays.toString(arr));
            return ;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseArray(arr, i+1, j-1);

        /*
        Explanation:
         * step-1: create a method which takes 3 params respectively arr, firstIndex, lastIndex
         * step-2: crate a temp variable to perform swapping between firstIndex and lastIndex elements of the given array
         * step-3: call the fn recursively by incrementing firstIndex by 1 and lastIndex by -1
         * step-4: write the base condition, when both firstIndex pointer and lastIndex pointer having same value or firstIndex will get bigger than lastIndex then return
         */
    }

    //Palindrome String
    public static boolean isPalindrome(String s, int i) {
        if (i >= s.length()/2) return true; //base condition

        if (s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return isPalindrome(s, i+1);

        /**
         * param1 is the String value which have to check whether the palindrome or not
         * param2 is the firstIndex value which will be update on every recursive call
         *
         */
    }

    //Fibonacci
    public static int Nthfibo(int n) {
        if (n <= 1) return n;
        int last = Nthfibo(n-1);
        int second_last = Nthfibo(n-2);
        return last+second_last;
    }

    //Driver method
    public static void main(String[] args) {
        //increment(1);
        //decrement(10);
       // System.out.println(factorial(5));
        //sum1(3, 0);
       // System.out.println(sum2(10));
       // reverseArray(new int[]{10,20,30,40,50,60}, 0, 5);
        //System.out.println(isPalindrome("madam", 0));
        System.out.println(Nthfibo(4));
    }


}
