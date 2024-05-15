package assesment.test1.section1;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows: ");
        int row = sc.nextInt();
        print(row);
    }

    private static void print(int row) {
        for (int i=1; i<=row; i++) {
            //space
            for (int sp=1; sp<=row-i; sp++)
                System.out.print(" ");
            //number pattern
            int counter1=1;
            int counter2=0;
            for (int j=1; j<=2*i-1; j++) {
                if (counter1<=i){
                    System.out.print(counter1);
                    counter1++;
                    counter2 = counter1-2;
                }else {
                    System.out.print(counter2);
                    counter2--;
                }
            }
            System.out.println();
        }
    }
}
