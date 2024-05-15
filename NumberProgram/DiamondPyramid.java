package NumberProgram;// Diamond pattern

import java.util.Scanner;

class DiamondPyramid
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the row size:");
		int size = sc.nextInt();
		
		for(int row=1; row<=size; row++){
			
			for(int space=1; space<=size-row; space++)  System.out.print(" ");
			for(int col=1; col<=row; col++)   System.out.print("* ");
			
			System.out.println();
		}
		
		for(int row=1; row<=size; row++){
			
			for(int space=1; space<=row; space++)  System.out.print(" ");
			for(int col=1; col<=size-row; col++)   System.out.print("* ");
			
			System.out.println();
		}
	}
}

/*
Enter the row size:
5
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

*/