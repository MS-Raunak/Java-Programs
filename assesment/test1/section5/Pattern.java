package assesment.test1.section5;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows: ");
        int row = sc.nextInt();


        for (int i=1; i<=row; i++) {
            for(int sp=1; sp<i; sp++)
                System.out.print(" ");
            int counter=5;
            int nextCounter=0;
            for (int j=i; j<=row*2-i; j++) {
                if (i==1) {
                    if (counter>=1) {
                        System.out.print(counter--);
                        nextCounter=counter+2;
                    }
                    else System.out.print(nextCounter++);
                }
                else if (j==i || j==row*2-i)
                     System.out.print(5);
                else System.out.print(" ");
            }


            System.out.println();
        }

    }
}
