package PatternProgram;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int n = sc.nextInt();

//        pyramid(n);
        reversePyramid(n);
//        holoPyramid(n);
//        reverseHoloPyramid(n);
//        dymondPyramid(n);
//        holoDymondPyramid(n);
    }

    // Pyramid
    private static void pyramid(int n) {
        for (int i=1; i<=n; i++){
            //print space
            for (int sp=1; sp<=n-i; sp++){
                System.out.print(" ");
            }
            //print star
            for (int st=1; st<=2*i-1; st++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

//    Reverse Pyramid
    private static void reversePyramid(int n) {
        for (int i=1; i<=n; i++){
            //print spcae
            for (int sp=1; sp<i; sp++){
                System.out.print(" ");
            }
            //print star
            for (int st=i; st<=n*2-i; st++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    Holo Pyramid
    private static void holoPyramid(int n){
        for (int i=1; i<=n; i++){
            //space
            for (int sp=1; sp<=n-i; sp++){
                System.out.print(" ");
            }
            //star
            for (int st=1; st<=2*i-1; st++){
                if (st==1 || st==2*i-1 || i==n)
                    System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }
    }

    //Reverse holo pyramid
    private static void reverseHoloPyramid(int n){
        for (int i=1; i<=n; i++){
            //space
            for (int sp=1; sp<i; sp++){
                System.out.print(" ");
            }
            //star
            for (int st=i; st<=n*2-i; st++){
                if (st==i || st==n*2-i || i==1 )
                    System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }
    }

    //Dymond Pyramid
    private static void dymondPyramid(int n) {
        if (n%2!=0) n=n+1;
        for (int i=1; i<n; i++){
            if (i<=n/2){
                //space
                for (int sp=1; sp<=n-i; sp++){
                    System.out.print(" ");
                }
                //star
                for (int st=1; st<=2*i-1; st++){
                    System.out.print("*");
                }
            }
            else {
                //space
                for (int sp=1; sp<=i; sp++){
                    System.out.print(" ");
                }
                //star
                for (int st=i; st<2*n-i-1; st++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    //Holo Dymond Pyramid
    private static void holoDymondPyramid(int n){
        if (n%2!=0) n=n+1;

        for (int i=1; i<n; i++){
            if (i<=n/2){
                //space
                for (int sp=1; sp<=n-i; sp++){
                    System.out.print(" ");
                }
                //star
                for (int st=1; st<=2*i-1; st++){
                    if (st==1 || st==2*i-1)
                        System.out.print("*");
                    else System.out.print(" ");
                }
            }
            else {
                //space
                for (int sp=1; sp<=i; sp++){
                    System.out.print(" ");
                }
                //star
                for (int st=i; st<n*2-i-1; st++){
                    if (st==i || st==n*2-i-2)
                        System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
