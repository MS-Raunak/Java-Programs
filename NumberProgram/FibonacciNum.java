package NumberProgram;

import java.util.Scanner;

class FibonacciNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length:");
		int length = sc.nextInt();
		
		int a = 0, b=1 ,c;
		
		for(int i=1; i<=length; i++){
			System.out.print(a + " " );
			c = a+b;
			a = b;
			b = c;
		}		
	}
} 
/*
Enter number:5
1 1

2 1

3 1

4 1

5 1
*/
