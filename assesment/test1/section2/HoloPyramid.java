package assesment.test1.section2;

import java.util.Scanner;

public class HoloPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows: ");
        int rows = sc.nextInt();

        for (int i=0; i<=rows; i++) {
            //space
            for (int sp=1; sp<=rows-i; sp++)
                System.out.print(" ");
            //star
            for (int j=1; j<=2*i-1; j++) {
                if (j==1 || i==rows || j==2*i-1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
