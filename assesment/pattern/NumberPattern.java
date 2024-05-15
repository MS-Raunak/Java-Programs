package assesment.pattern;

public class NumberPattern {
    // Snake-1 Pattern
    public static void snake1(int n){
        int counter=1;
        for (int i=1; i<=n; i++) {
            if (i%2!=0){
                for (int j=1; j<=i; j++) {
                    System.out.print(counter + " ");
                    counter++;
                }
            }
            else {
                int temp = counter + i - 1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(temp + " ");
                    temp--;
                }
                counter += i;
            }

            System.out.println();
        }
    }

    // Snake-2 Pattern
    public static void snake2(int n){
        int counter=1;

        for (int i=1; i<=n; i++) {
            if (i%2!=0) {
                for (int j=1; j<=n; j++) {
                    System.out.print(counter + " ");
                    counter++;
                }
            }
            else {
                counter = counter + n -1;
                for (int j=1; j<=n; j++){
                    System.out.print(counter + " ");
                    counter--;
                }
                counter = counter+n+1;
            }
            System.out.println();
        }
    }

    //Print Simple X pattern
    public static void simpleX(int n) {
        int counter=1;
        for (int row=1; row<=n; row++){
            for (int col=1; col<=n; col++){
                if (col==row || col==n-row+1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Print X-2 pattern
    public static void printX(int n) {
        int counter=1;

        for (int i=1; i<=n; i++) {
            if (i<=n/2) {
                for (int j = 1; j <= n; j++) {
                    if (i == j || j == n - i + 1)
                        System.out.print(counter);
                    else System.out.print(" ");
                }
                counter++;
            }
            else {
                for (int j = 1; j <= n; j++) {
                    if (i == j || j == n - i + 1)
                        System.out.print(counter);
                    else System.out.print(" ");
                }
                counter--;
            }

            System.out.println();
        }
    }

    //
    public static void pattern(int row) {
        for (int i=1; i<=row; i++) {
            for (int sp=1; sp<=row-i; sp++)
                System.out.print(" " + " ");
            int counter=1;
            int nexCounter=0;
            for (int j=1; j<=2*i-1; j++){
                if (counter<=i){
                    System.out.print(counter + " ");
                    counter++;
                    nexCounter=counter-2;
                }
                else {
                    System.out.print(nexCounter + " ");
                    nexCounter--;
                }
            }
            System.out.println();
        }
    }


    //Test Application
    public static void main(String[] args) {
       // snake1(5);
        //snake2(5);
       // simpleX(5);
        //printX(5);
        pattern(5);
    }
}
