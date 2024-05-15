package NumberProgram;

import java.util.Scanner;

class SquareOfDigit{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter n:");
		int n= sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=n; i++){
			int sq = i*i;
			//System.out.println("Square of " + i + "=" + sq);
			sum+=sq;
		}
		
		System.out.println("Sum of square of each digit : " + sum);
	}
}