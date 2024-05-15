package NumberProgram;

import java.util.Scanner;

class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int num = sc.nextInt();
		
		
		for(int i=5; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
				
	}
} 
/*
Enter number:5
* * * * *
* * * *
* * *
* *
*
*/
