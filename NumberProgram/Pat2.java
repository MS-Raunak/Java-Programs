package NumberProgram;

import java.util.Scanner;

class Pat2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of row:");
		int size=sc.nextInt();
		
		for(int row=5; row>=1; row--){
			for(int col=1; col<=row; col++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*

Enter the size of row:
4
* * * * *
* * * *
* * *
* *
*
*/