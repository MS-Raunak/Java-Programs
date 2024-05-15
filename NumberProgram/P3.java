package NumberProgram;

import java.util.Scanner;

class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int num = sc.nextInt();
		
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=num; j++){
				System.out.print(j);
			}
			System.out.println();
		}
				
	}
} 
/*
Enter number:5
12345
12345
12345
12345
12345
*/
