package PatternProgram;

import java.util.Scanner;
/*
- - - - 1
- - - 1 2 1
- - 1 2 3 2 1
- 1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

*/
class SpaceNumberPattern {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();

        // i for row number
        for(int i=1; i<=n; i++){
            // space for space
            for(int space=1; space<=n-i; space++){
                System.out.print(" " + " ");
            }
            // j for 1st-half pyramid
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }

            // k for 2nd-half pyramid
            for(int k=i-1; k>=1; k--){
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
