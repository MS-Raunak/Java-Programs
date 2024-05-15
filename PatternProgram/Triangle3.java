package PatternProgram;

import java.util.Scanner;

/*

* * * * *
  * * * *
    * * *
      * *
        *

 */
public class Triangle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = sc.nextInt();

        for (int i=1; i<=size; i++){
            if (i>1){
                for (int space=1; space<i; space++)
                    System.out.print(" ");
            }
            for (int j=i; j<=size; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
