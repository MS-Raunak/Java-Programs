package NumberProgram;

import java.util.Scanner;

class Pyramid1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();

		
		for(int row=1; row<=size; row++){
			
			for(int space=1; space<=size-row; space++) 
				System.out.print(" ");
			for(int col=1; col<=row; col++)
				System.out.print("* ");
				
			System.out.println();
		}
				
	}
} 


/*
OUTPUT
Enter size:5
    *
   * *
  * * *
 * * * *
* * * * *

*/