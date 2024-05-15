package assesment.test1.section3;

public class HoloDiamond {
    public static void main(String[] args) {
        diamond(13);
    }

    private static void diamond(int row) {
        row = row+1;
        for (int i=1; i<row; i++) {
            if (i<=row/2){
                for (int sp=1; sp<=row/2-i; sp++)
                    System.out.print(" ");
                for (int j=1; j<=2*i-1; j++){
                    if (j==1 || j==2*i-1)
                        System.out.print("*");
                    else System.out.print(" ");
                }

            }
            else {
                for (int sp=1; sp<=i-row/2; sp++)
                    System.out.print(" ");
                for (int j=i; j<=(2*row-i)-2; j++){
                    if (j==i || j==(2*row-i)-2)
                        System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
