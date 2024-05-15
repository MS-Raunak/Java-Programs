package assesment.numbers;

import java.util.Scanner;

public class SadNumber {

    public static void sad(int num) {
        int sum=0;
        while (num!=sum) {
            for (int i=num; i>0; i/=10){
                sum += Math.pow(i%10, 2);
            }
            if (sum > 9 ) num = sum;

            else if (sum < 9){
                System.out.println("Not a sad");
                return;
            }
        }

        System.out.println("Sad Number");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num: ");
        int num = sc.nextInt();

        sad(num);
    }
}
