package assesment.pattern;

public class PyramidPattern {
    //simple pyramid
    public static void pyramid(int rows) {
        for (int i=1; i<=rows; i++) {
            for (int sp=1; sp<=rows-i; sp++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Holo pyramid
    public static void holoPyramid(int rows) {
        for (int i=1; i<=rows; i++) {
            for (int sp=1; sp<=rows-i; sp++)
                System.out.print(" ");
            for (int j=1; j<=2*i-1; j++){
                if (j==1 || j==2*i-1 || i==rows)
                    System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }
    }

    //Reverse pyramid
    public static void reversePyramid(int rows) {
        for (int i=1; i<=rows; i++){
            for (int sp=1; sp<i; sp++)
                System.out.print(" ");
            for (int j=i; j<=2*rows-i; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    //Holo Reverse pyramid
    public static void holoReversePyramid(int rows){
        for (int i=1; i<=rows; i++) {
            for (int sp=1; sp<i; sp++){
                System.out.print(" ");
            }
            for (int j=i; j<=rows*2-i; j++) {
                if (j==i || j==rows*2-i || i==1)
                    System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }
    }

    //Diamond
    public static void diamond(int rows) {
        for (int i=1; i<=rows; i++) {
            if (i<=rows/2+1){
                for (int sp=1; sp<rows-i; sp++) {
                    System.out.print(" ");
                }
                for (int j=1; j<=2*i-1; j++){
                    System.out.print("*");
                }
            }
            else {
                for (int sp=i; sp<2*i-2; sp++){
                    System.out.print(" ");
                }
                for (int j=i; j<=rows*2-i; j++){
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }


    //Holo-Diamond Program
    public static void holoDiamond(int rows) {
        for (int i=1; i<=rows; i++) {
            if (i<=rows/2+1) {
                for (int sp=1; sp<rows-i; sp++)
                    System.out.print(" ");
                for (int j=1; j<=2*i-1; j++) {
                   if (j==1 || j==2*i-1)
                       System.out.print("*");
                   else  System.out.print(" ");
                }
            }
            else {
                for (int sp=i; sp<2*i-2; sp++)
                    System.out.print(" ");
                for (int j=i; j<=rows*2-i; j++){
                    if (j==i || j==rows*2-i)
                        System.out.print("*");
                    else  System.out.print(" ");
                }
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
//        pyramid(6);
//        holoPyramid(5);
//        reversePyramid(5);
//        holoReversePyramid(5);
//        diamond(9);
        holoDiamond(9);
    }
}
