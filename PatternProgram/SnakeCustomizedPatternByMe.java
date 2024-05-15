package PatternProgram;

import java.util.Scanner;

public class SnakeCustomizedPatternByMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int num=1; // for initialize row

        for (int i=1; i<=n; i++){
            if (i%2!=0){
                for (int j=1; j<=n; j++){
                    System.out.print(num + "\t");
                    num++;                 // store last value + 1
                }
            }
            else {
                num=num+(n-1);           // initialize even row
                for (int j=1; j<=n; j++){
                    System.out.print(num + "\t");
                    num--;             // store last value - 1
                }
                num=num+(n+1);        // initialize further odd row
            }

            System.out.println();
        }
    }
}