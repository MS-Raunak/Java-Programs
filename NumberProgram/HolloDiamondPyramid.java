package NumberProgram;

import java.util.Scanner;

class HolloDiamondPyramid {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row:");
		int size = sc.nextInt();
		
		for(int row=1; row<=size; row++){
			for(int space=1; space<=size-row; space++)
				System.out.print(" ");
			for(int col=1; col<=(2*row)-1; col++) {
				if (col==1 || col == (2*row)-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
//
			System.out.println();
		}
		
		for(int row=size-1; row>=1; row--){
			for(int space=1; space<=size-row; space++)
				System.out.print(" ");
			for(int col=1; col<=(2*row)-1; col++) {
				if (col==1 || col == (2*row)-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}
}

