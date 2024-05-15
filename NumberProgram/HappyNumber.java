package NumberProgram;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isHappy(num)) System.out.println(num + " is a Happy Number");
        else System.out.println(num + " is not a Happy Number");
    }

    private static boolean isHappy(int num) {
        while (num>=1){
            int sum=0;
            for (int i=num; i>0; i/=10){
                int digit = i%10;
                sum+=(int)Math.pow(digit,2);
            }
           if (sum>9) num=sum;
           else if (sum == 1) return true;
           else return false;
        }
        return false;
    }
}
