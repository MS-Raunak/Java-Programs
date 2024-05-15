package assesment.numbers;

import java.util.Scanner;

public class HappyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isHappy(num);
    }

    private static void isHappy(int num) {
        while (num>=1){
            int sum=0;
            for (int i=num; i>0; i/=10) {
                sum += Math.pow(i%10, 2);
            }
            if (sum==1) {
                System.out.println("Happy Number");
                break;
            }
            else if (sum>9) num=sum;
            else {
                System.out.println("NOT Happy Number");
                break;
            }
        }
    }
}
