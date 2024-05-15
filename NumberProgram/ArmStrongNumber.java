package NumberProgram;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int count = count(num);
        if (isArmStrong(num,count)) System.out.println(num + " is an Armstrong Number");
        else System.out.println(num + " is not an Armstrong number");
    }

    //count total digit in given number
    private static int count(int num) {
        int count=0;
        for (int i=num; i>0; i/=10){
            count++;
        }
        return count;
    }

    //checking Armstrong number
    private static boolean isArmStrong(int num,int count) {
        int sum=0;
        for (int i=num; i>0; i/=10){
            int digit = i%10;
            sum+=Math.pow(digit, count);
        }
        if (sum==num) return true;
        return false;
    }

}

/* Armstrong Number: sum of power of total digit of each digit of given number = given number

EX: 153 => 1^3 + 5^3 + 3^3 = 153(since, 153 has 3 digit that's why here power is 3)
Note: If num of digit in a given number is 2 then will take 2 in power
  EX: 22 => 2^2 + 2^2 != 22 (Not armstarong num)
  EX: 1 => 1^1 = 1(Armstrong number)

*/