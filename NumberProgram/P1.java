package NumberProgram;

import java.util.Scanner;

class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=num; j++){
				System.out.println(i + " " + j);
			}
			System.out.println();
		}
				
	}
} 

/*
Enter number:3
1 1
1 2
1 3

2 1
2 2
2 3

3 1
3 2
3 3

*/